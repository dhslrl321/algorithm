package baekjoon.ps9exhaustiveSearch;

import java.util.Arrays;
import java.util.Scanner;

public class P19_Out {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = input.nextInt();
            arr[i][1] = input.nextInt();
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int sum = arr[i][1];
            int index = 0;
            index += arr[i][0];
            for (int j = index; j < n; j++) {
                sum += arr[j][1];
                index += arr[j][0];
            }
            arr[i][1] = sum;
        }

        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, arr[i][1]);
        }
        System.out.println(answer);
    }
}
