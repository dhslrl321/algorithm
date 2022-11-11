package com.wonit.k2022;

import java.util.ArrayList;
import java.util.List;

public class P2 {
    public static void main(String[] args) {
        int[] cost = {10, 20, 14, 40, 50};
        int x = 70;

        System.out.println(solution(cost, x));

        int[] cost2 = {3, 4, 1};
        int x2 = 8;

        System.out.println(solution(cost2, x2));

        int[] cost3 = {19, 78, 27, 18, 20};
        int x3 = 25;

        System.out.println(solution(cost3, x3));
    }

    /**
     *  핵심은 인덱스가 큰것 부터 채워넣으면 된다는 것임
     */
    private static int solution(int[] cost, int x) {
        int countOfPaint = cost.length - 1;
        int bestOptionPaintCount = 0;

        // 가격을 포맷에 맞게 출력해

        for (int i = countOfPaint; i >= 0; i--) {
            List<Integer> candidates = new ArrayList<>();
            int basePrice = cost[i];
            candidates.add(i);
            int accumulatedPrice = basePrice;

            for (int j = i - 1; j >= 0; j--) {
                if (accumulatedPrice + cost[j] <= x) {
                    candidates.add(j);
                    accumulatedPrice += cost[j];
                }
            }

            for (Integer candidate : candidates) {
                bestOptionPaintCount += (int) Math.pow(2, candidate);
            }

            if (bestOptionPaintCount != 0) return bestOptionPaintCount;
        }

        return applyResultFormat(bestOptionPaintCount);
    }

    private static int applyResultFormat(int result) {
        if (Math.pow(10, 9) + 7 < result) {
            return (int) (result % (Math.pow(10, 9) + 7));
        }
        return result;
    }
}
