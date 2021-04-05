package baekjoon.ps11simulation;

import java.io.*;

public class P03_IllnessKnight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int answer = 0;
        if(n == 1) bw.write("1");
        else {
            if(n == 2) {
                if(m == 3 || m == 4) answer = 1;
                else if(m == 5 || m == 6) answer = 2;
                else if(m == 7 || m == 8) answer = 3;
                else if(m >= 9) answer = 4;
            }else if(n >= 3) {
                if(m >= 7) answer = 4 + (m - 7) + 1;
            }
        }
        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}
