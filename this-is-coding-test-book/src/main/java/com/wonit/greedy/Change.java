package com.wonit.greedy;

public class Change {
    public static void main(String[] args) {
        int[] candidates = {500, 100, 50, 10};

        int money = 1260;
        int answer = 0;

        while (isLeftChange(money)) {
            int change = peekProperChange(money, candidates);
            int a = getChangeableCoinCount(money, change);
            money -= a * change;
            answer += a;
        }

        System.out.println(answer);
    }

    private static int getChangeableCoinCount(int money, int change) {
        int a = money / change;
        return a;
    }

    private static boolean isLeftChange(int money) {
        return money != 0;
    }

    private static int peekProperChange(int money, int[] candidates) {
        // 가장 큰 동전을 peek
        for (int candidate : candidates) {
            if (money >= candidate) {
                return candidate;
            }
        }
        throw new IllegalStateException();
    }
}
