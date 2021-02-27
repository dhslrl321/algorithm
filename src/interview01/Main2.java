package interview01;

import java.io.*;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] pnh = br.readLine().split(" ");

        int p = Integer.parseInt(pnh[0]);
        int n = Integer.parseInt(pnh[1]);
        int h = Integer.parseInt(pnh[2]);

        int[][] arr = new int[1001][101];
        int[][] dp = new int[1001][101];
        for (int i = 0; i <= n; i++) {
            String[] line = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(line[0]);
            arr[i][1] = Integer.parseInt(line[1]);
        }

        bw.flush();
        bw.close();
    }
}
