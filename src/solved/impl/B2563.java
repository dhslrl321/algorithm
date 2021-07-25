package solved.impl;

import java.io.*;

public class B2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[100][100];

        while (n-- > 0) {
            String[] xy = br.readLine().split(" ");

            int x = Integer.parseInt(xy[0]) - 1;
            int y = Integer.parseInt(xy[1]) - 1;

            for (int i = y; i < y + 10; i++) {
                for (int j = x; j < x + 10; j++) {
                    arr[i][j] = 1;
                }
            }
        }

        int count = 0;

        for(int[] iter : arr) {
            for(int value : iter) {
                if(value == 1) count++;
            }
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
    }
}
