package baekjoon.stage.stage11_DynamicPrograming;

import java.io.*;

public class Prob07_01Tialing {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(input.readLine());

        long[] arr = new long[n+1];

        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 15746;
        }

        output.write(arr[n-1] % 15746 + "\n");
        output.flush();
        output.close();
    }

}

