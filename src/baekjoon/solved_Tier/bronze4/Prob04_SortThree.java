package baekjoon.solved_Tier.bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class Prob04_SortThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        for(int value : arr) System.out.print(value+" ");
    }
}
