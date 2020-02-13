package stage.stage05_oneDimensionArray;

import java.util.Scanner;

public class Prob02_FIndMaxVal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                System.out.println(max);
                System.out.println(i + 1);
            }
        }
    }
}
