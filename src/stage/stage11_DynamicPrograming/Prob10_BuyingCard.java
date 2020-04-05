package stage.stage11_DynamicPrograming;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Prob10_BuyingCard {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] d = new int[n+1];

        //Arrays.fill(d, 1000 * 10000);

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            d[i] = 1000 * 10000;
        }
        //d[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.min(d[i], d[i-j] + arr[j]);
            }
        }

        bw.write(d[n] + "\n");

        bw.flush();
        bw.close();
    }
}
