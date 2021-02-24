package baekjoon.ps9exhaustiveSearch;

import java.io.*;

public class P05_Calendar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            String[] nmxy = br.readLine().split(" ");
            int n = Integer.parseInt(nmxy[0]);
            int m = Integer.parseInt(nmxy[1]);
            int x = Integer.parseInt(nmxy[2]) - 1;
            int y = Integer.parseInt(nmxy[3]) - 1;

            boolean flag = false;
            for (int i = x; i < n*m; i+=n) {
                if(i%m == y) {
                    bw.write((i + 1) + "\n");
                    flag = true;
                    break;
                }
            }
            if(!flag) bw.write("-1\n");
        }
        bw.flush();
        bw.close();
    }
}
