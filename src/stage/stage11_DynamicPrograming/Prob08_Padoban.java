package stage.stage11_DynamicPrograming;

import java.io.*;


public class Prob08_Padoban {

    static long[] memo = new long[101];

    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(input.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(input.readLine());
            output.write(d(n) + "\n");
        }

        output.flush();
        output.close();
    }

    private static long d(int n){
        if(memo[n] > 0) return memo[n];
        if(n == 1) return 1;
        else if(n == 2) return 1;
        else if(n == 3) return 1;
        else memo[n] = d(n-3) + d(n-2);
        return memo[n];
    }
}
