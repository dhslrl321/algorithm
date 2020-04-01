package stage.stage11_DynamicPrograming;

import java.io.*;

public class Prob06_CardBuying {

    static int[] memo = new int[6];

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = d(Integer.parseInt(input.readLine())) + Integer.parseInt(input.readLine());
        output.write(num + "\n");
        output.flush();
        output.close();
    }

    private static int d(int n){
        if(memo[n] > 0) return memo[n];
        memo[0] = 1;
        memo[1] = 2;
        memo[n] = d(n-1) + d(n-2);
        return memo[n];
    }
}
