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
        int[] arr = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] d = new int[n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.max(d[i], d[i-j] + arr[j]);
            }
        }
        output.write(d[n] + "\n");
        output.flush();
        output.close();
    }
}
