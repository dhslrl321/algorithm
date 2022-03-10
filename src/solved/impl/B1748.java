package solved.impl;

import java.io.*;

public class B1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String nString = br.readLine();
        int n = Integer.parseInt(nString);

        int answer = solutionB(n);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static int solutionA(int n) {
        int digit = (int) Math.log10(n) + 1; // 자리수
        int acc = 0;
        int step = 1;

        for (int i = 1; i < n; i *= 10) {
            int now = (int) Math.log10(i) + 1;
            if (now == digit) break;

            int start = i;
            int end = (i * 10) - 1;
            int temp = (end - start) + 1;

            acc += temp * step;
            step++;
        }

        acc += (n - (Math.pow(10, digit - 1)) + 1) * digit;
        return acc;
    }

    private static int solutionB(int n) {
        int step = 1;
        int target = 10;
        int acc = 0;
        for (int i = 1; i <= n; i++) {
            if (i % target == 0) {
                step++;
                target *= 10;
            }
            acc += step;
        }

        return acc;
    }
}
