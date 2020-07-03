package baekjoon.stage.stage05_OneDimensionArray;

import java.util.Scanner;

public class Prob01_max_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputCount = input.nextInt();

        int arr[] = new int[inputCount];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0], min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
