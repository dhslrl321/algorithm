package baekjoon.stage.stage11_DynamicPrograming;

import java.io.*;

public class Prob03_2nTiling {

    static int[] memo;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        memo = new int[n+1];
        System.out.println(dp(n));
    }

    private static int dp(int n){

        if(memo[n] > 0) return memo[n];

        memo[1] = 1;
        memo[2] = 2;
        memo[n] = dp(n-1) + dp(n-2);
        memo[n] %= 10007;
        return memo[n];
    }


}
