package baekjoon.stage.stage11_DynamicPrograming;

import java.io.*;
import java.util.StringTokenizer;


public class Prob11_BuyingCard2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] d = new int[n+1];
        for (int i = 1; i < d.length; i++) {
            d[i] = -1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(d[i] == -1 || d[i] > d[i-j] + d[j])
                d[i] = Math.min(d[i], d[i-j] + arr[j]);
            }
        }

        bw.write(d[n] + "\n");
        bw.flush();
        bw.close();

    }
}
