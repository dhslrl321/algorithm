package baekjoon.ps9exhaustiveSearch;

import java.io.*;

public class P06_NumberWrite {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long answer = 0;
        int len = 1;
        for (int i = 1; i <= n; i*=10) {
            answer += (((i * 10) - 1) - i ) * len++;
            System.out.println(answer);
            if(i >= n) break;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
