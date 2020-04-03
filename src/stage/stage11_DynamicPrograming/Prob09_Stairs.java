package stage.stage11_DynamicPrograming;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob09_Stairs {

    static int[] memo = new int[301];

    public static void main(String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(input.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input.readLine());
        }

        output.write(d(n, arr) + "\n");

        output.flush();
        output.close();
    }

    private static int d(int n, int[] arr){
        if(memo[n] > 0) return memo[n];
        memo[0] = arr[0];
        memo[1] = arr[1];
        memo[n] = Math.max(d(n-1, arr) + memo[n-3], d(n-2, arr) + memo[n-2]);
        return memo[n];
    }
}
