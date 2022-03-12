package solved.impl;

import java.io.*;
import java.util.*;

public class B1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }

        int loop = Integer.parseInt(br.readLine());

        while (loop-- > 0) {
            String[] genderAndNumber = br.readLine().split(" ");
            int gender = Integer.parseInt(genderAndNumber[0]);
            int number = Integer.parseInt(genderAndNumber[1]) - 1;

            if (gender == 1) {
                male2(arr, number);
            } else {
                female2(arr, number);
            }
        }

        for (int i = 1; i <= arr.length; i++) {
            bw.write(arr[i - 1] + " ");
            if (i % 20 == 0) {
                bw.write("\n");
            }
        }

        bw.flush();
        bw.close();
    }

    private static void male(int[] arr, int number) {
        number += 1;
        for (int i = number; i <= arr.length; i++) {
            if (i % number == 0) {
                toggleArrayValueByIndex(arr, i - 1);
            }
        }
    }

    private static void female(int[] arr, int number) {

    }

    private static void male2(int[] arr, int number) {
        number += 1;
        for (int i = number; i <= arr.length; i++) {
            if (i % number == 0) {
                toggleArrayValueByIndex(arr, i-1);
            }
        }
    }

    private static void female2(int[] arr, int number) {
        toggleArrayValueByIndex(arr, number);

        int start = number - 1;
        int end = number + 1;

        while (validateArrayIndex(arr, start, end)) {
            if (arr[start] != arr[end]) {
                break;
            }
            toggleArrayValueByIndex(arr, start);
            toggleArrayValueByIndex(arr, end);
            start--;
            end++;
        }
    }

    private static boolean validateArrayIndex(int[] arr, int index1, int index2) {
        int maxIndex = arr.length - 1;
        return index1 >= 0 && maxIndex >= index2;
    }

    private static void toggleArrayValueByIndex(int[] arr, int index) {
        arr[index] = (arr[index] == 0) ? 1 : 0;
    }
}
