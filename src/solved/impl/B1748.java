package solved.impl;

import java.io.*;

public class B1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String nString = br.readLine();
        int n = Integer.parseInt(nString);
        int digit = (int) Math.log10(n) + 1; // 자리수
        int count = 0;
        int step = 1;

        for (int i = 1; i < n; i *= 10) {
            int now = (int) Math.log10(i) + 1;
            if (now == digit) break;

            int start = i;
            int end = (i * 10) - 1;
            int temp = (end - start) + 1;

            count += temp * step;
            step++;
        }

        count += (n - (Math.pow(10, digit - 1)) + 1) * digit;

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
