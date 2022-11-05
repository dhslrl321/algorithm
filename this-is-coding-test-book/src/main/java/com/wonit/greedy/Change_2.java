package com.wonit.greedy;

public class Change_2 {
    public static void main(String[] args) {
        int[] coins = {500, 100, 50, 10};

        int money = 1260;
        int answer = 0;

        for (int coin : coins) {
            int x = money / coin;
            answer += x;
            money %= coin;
        }

        System.out.println("answer = " + answer);
    }
}
