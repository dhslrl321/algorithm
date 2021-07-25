package solved.impl;

import java.io.*;
import java.util.Arrays;

public class B1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ab = br.readLine().split(" ");

        int[] arr = new int[1001];

        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        int mult = 1;

        for (int i = 1; i < 1001;) {
            int loop = mult;
            while(i < arr.length && loop-- > 0) {
                arr[i++] = mult;
            }
            mult++;
        }

        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
