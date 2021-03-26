package baekjoon.ps10greedy;

import java.io.*;

public class P11_GameMakerDonjun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        reverseOrder(arr);
        int answer = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] <= arr[i]) {
                answer += arr[i] - (arr[i-1] - 1);
                arr[i] = arr[i-1] - 1;
            }
        }

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
            start++;
            end--;
        }
    }
}
