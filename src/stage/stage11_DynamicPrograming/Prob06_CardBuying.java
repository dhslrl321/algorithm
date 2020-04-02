package stage.stage11_DynamicPrograming;

import java.io.*;
import java.util.*;

public class Prob06_CardBuying {

    static int[] arr;
    static int[] memo = new int[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(input.readLine());

        StringTokenizer st = new StringTokenizer(input.readLine());
        arr = new int[n];
        int i = 0;

        while(st.hasMoreTokens()){
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }


        output.write("\n");
        output.flush();
        output.close();
    }
}
