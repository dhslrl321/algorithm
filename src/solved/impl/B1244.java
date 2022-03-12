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
                male(arr, number);
            } else {
                female(arr, number);
            }
        }

        for (int value : arr) {
            bw.write(value + " ");
        }

        bw.flush();
        bw.close();
    }

    private static void male(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (i % number == 0 && validateArrayIndex(arr, 0, i)) {
                toggleArrayValueByIndex(arr, i);
            }
        }
    }

    private static void female(int[] arr, int number) {
        int start = number - 1;
        int end = number + 1;

        if (validateArrayIndex(arr, start, end) && arr[start] != arr[end]) {
            toggleArrayValueByIndex(arr, number);
        }

        while (validateArrayIndex(arr, start, end) && arr[start] == arr[end]) {
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
        arr[index] = arr[index] == 0 ? 1 : 0;
    }
}
