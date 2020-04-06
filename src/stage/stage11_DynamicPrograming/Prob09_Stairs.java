package stage.stage11_DynamicPrograming;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob09_Stairs {


    public static void main(String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(input.readLine());
        int[] arr = new int[n+1];
        int[] d = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(input.readLine());
        }

        d[1] = arr[1];
        if (n >= 2) d[2] = arr[1] + arr[2];
        d[3] = Math.max(arr[1] + arr[2], arr[3]);
        for (int i = 3; i <= n; i++) {
            d[i] = Math.max(d[i-3] + arr[i-1] + arr[i], d[i-2] + arr[i]);
        }
        output.write(d[n] + "\n");
        output.flush();
        output.close();
    }


}
