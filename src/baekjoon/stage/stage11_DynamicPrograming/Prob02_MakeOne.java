package baekjoon.stage.stage11_DynamicPrograming;

import java.io.*;

public class Prob02_MakeOne {
    static int[] memo;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        memo = new int[n+1];

        bw.write(dp(n) + "\n");

        bw.flush();
        bw.close();

    }

    private static int dp(int n){
        if(n == 1) return 0; // minimum case
        if(memo[n] > 0) return memo[n]; // duplication checker
        memo[n] = dp(n-1) + 1; // this location is important.

        if(n % 2 == 0){
            int temp = dp(n/2) + 1;
            if(memo[n] > temp) memo[n] = temp;
        }
        else if(n % 3 == 0){
            int temp = dp(n/3) + 1;
            if(memo[n] > temp) memo[n] = temp;
        }

        return memo[n];
    }
}
