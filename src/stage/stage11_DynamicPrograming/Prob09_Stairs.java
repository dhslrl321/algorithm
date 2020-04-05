package stage.stage11_DynamicPrograming;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob09_Stairs {


    public static void main(String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(input.readLine());
        int[] arr = new int[n];
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input.readLine());
        }

        d[0] = arr[0];
        d[1] = arr[0] + arr[1];

        for (int i = 2; i < n; i++) {
            d[i] = Math.max(d[i-2] + arr[i], d[i-1] + arr[i+1]);
        }
        output.write(Arrays.toString(d) + "\n");
        output.flush();
        output.close();
    }


}
