package baekjoon.ps9exhaustiveSearch;

import java.util.Scanner;

public class P18_TSP {

    static int[][] map;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        map = new int[n][n];
        int[] country = new int[n];
        for (int i = 0; i < n; i++) {
            country[i] = i;
            for (int j = 0; j < n; j++) {
                map[i][j] = input.nextInt();
            }
        }
        int answer = Integer.MAX_VALUE;
        do {
            int sum = 0;
            boolean flag = false;
            for (int i = 0; i < country.length - 1; i++) {
                if(map[country[i]][country[i+1]] == 0) flag = true;
                else sum += map[country[i]][country[i+1]];
            }
            int value = map[country[country.length - 1]][country[0]];
            if(!flag && value != 0) {
                sum += value;
                answer = Math.min(answer, sum);
            }
        }while(nextPermutation(country));
        System.out.println(answer);
    }

    private static boolean nextPermutation(int[] arr) {
        int i = arr.length - 1;
        while(i > 0 && arr[i-1] >= arr[i]) i--;
        if(i <= 0) return false;

        int j = arr.length - 1;
        while(arr[i-1] >= arr[j]) j--;
        swap(arr, i-1, j);

        j = arr.length - 1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        return true;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
