package solved.class2;

import java.io.*;
import java.util.Arrays;

public class B1080 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] start = new int[n][m];
        int[][] target = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                start[i][j] = Integer.parseInt(line[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                target[i][j] = Integer.parseInt(line[j]);
            }
        }

        int answer = 0;

        if(n < 3 || m < 3) {
            if(Arrays.deepEquals(start, target)) {
                bw.write("0");
            }else {
                bw.write("-1");
            }
            bw.flush();
            return;
        }

        if(Arrays.deepEquals(start, target)) {
            bw.write("0");
            bw.flush();
            return;
        }else {
            mainLoop: for (int i = 0; i < n - 2; i++) {
                for (int j = 0; j < m - 2; j++) {
                    if(start[i][j] != target[i][j]) {
                        flip(i, j, start);
                        answer++;
                    }
                }
            }
        }

        if(Arrays.deepEquals(start, target)) {
            bw.write(String.valueOf(answer));
        }else {
            bw.write("-1");
        }


        bw.flush();
        bw.close();
    }

    private static void flip(int y, int x, int[][] arr) {
        for (int i = y; i < y + 3; i++) {
            for (int j = x; j < x + 3; j++) {
                arr[i][j] = (arr[i][j] == 1) ? 0 : 1;
            }
        }
    }
}
