package com.wonit.binarysearch.ps;

public class MaxWidth {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 9, 6, 7, 3};

        int start = 0;
        int end = maxFrom(arr);

        int result = arr[0];

        /*while (start <= end) {
            int mid = (start + end) / 2;

            for (int i = 0; i < arr.length; i++) {
                int width = calculateWidthBy(arr, mid);

                // width 처음으로 감소하는 조건을 만나면?
                if (width < mid) {
                    end = mid - 1;
                }
            }
        }*/

        System.out.println(calculateWidthBy(arr, 1));
    }

    private static int calculateWidthBy(int[] arr, int height) {
        /**
         * 연속된 것들의 넓이
         */

        int width = 0;

        for (int i = 0; i < arr.length; i++) {
            int tempWidth = 0;
            while (i < arr.length && arr[i] >= height) {
                tempWidth += height;
                i++;
            }
            width = Math.max(width, tempWidth);
        }

        return width;
    }

    private static int maxFrom(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }
}
