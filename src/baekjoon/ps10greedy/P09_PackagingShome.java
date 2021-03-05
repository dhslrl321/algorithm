package baekjoon.ps10greedy;

import java.io.*;

public class P09_PackagingShome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");
        String[] boxes = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(boxes[i]);
        }

        long answer = sum / m;

        if (sum % m != 0) answer += 1;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
