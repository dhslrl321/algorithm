package baekjoon.stage.stage11_DynamicPrograming;

import java.io.*;

public class Prob05_OneTwoThreePlusTD {
    static int[] memo = new int[12];

    public static void main(String[] args) throws IOException {
        BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(input.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(input.readLine());
            output.write(dp(n) + "\n");
        }
        output.flush();
        output.close();
    }

    private static int dp(int n){
        if(memo[n] > 0) return memo[n];
        if(n == 1) return 1;
        else if(n == 2) return 2;
        else if(n == 3) return 4;
        else {
            memo[n] = dp(n-1) + dp(n-2) + dp(n-3);
            return memo[n];

        }
    }
}
