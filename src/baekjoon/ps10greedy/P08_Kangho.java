package baekjoon.ps10greedy;

import java.io.*;
import java.util.Arrays;

public class P08_Kangho {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        reverseOrder(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - ((i+1) - 1);
        }

        long answer = 0;

        for(int value : arr) answer += value;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static void reverseOrder(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
}
