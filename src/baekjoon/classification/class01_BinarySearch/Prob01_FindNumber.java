package baekjoon.classification.class01_BinarySearch;

import java.util.Scanner;
import java.util.Arrays;

public class Prob01_FindNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        
        int num = input.nextInt();
        
        int[] compArr = new int[num];
        for (int i = 0; i < num; i++) {
            compArr[i] = input.nextInt();
        }

        for (int i=0; i<compArr.length; i++) {

            if(Arrays.binarySearch(arr, compArr[i]) < 0) System.out.println(0);
            else System.out.println(1);
        }

    }
}
