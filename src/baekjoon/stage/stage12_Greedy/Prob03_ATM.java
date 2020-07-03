package baekjoon.stage.stage12_Greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob03_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        //int sum = 0;
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
            }
        }*/
        int sum = 0;
        sum += arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
            sum += arr[i];
        }


        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
