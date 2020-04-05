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

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input.readLine());
        }

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < i; j++) {
                d[i] = Math.max(d[n-1] + arr[j], d[n-2] + arr[j]);
            }
        }
        output.write(d[n] + "\n");
        output.flush();
        output.close();
    }


}
