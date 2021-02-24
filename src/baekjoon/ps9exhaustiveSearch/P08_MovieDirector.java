package baekjoon.ps9exhaustiveSearch;

import java.io.*;

public class P08_MovieDirector {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer++;
            while(!isTitle(answer)) {
                answer++;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static boolean isTitle(int n) {
        return String.valueOf(n).contains("666");
    }
}