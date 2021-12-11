package kep;

import java.io.*;
import java.util.StringTokenizer;

public class P3 {
    static long dp[][] = new long[201][201];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tc = br.readLine();
        StringTokenizer st = new StringTokenizer(tc, " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for(int i=0; i<201; i++){
            dp[i][0] = 1;
            dp[1][i] = 1;
        }
        for(int i=1; i<201; i++){
            dp[2][i] = i+1;
        }
        for(int i=3; i<201; i++){
            for(int j=1; j<201; j++){
                for(int k1=0; k1<=j; k1++){
                    dp[i][j]+= dp[i-1][j-k1]%1000000000;
                }
            }
        }
        System.out.println(dp[k][n]%1000000000);
    }
}

