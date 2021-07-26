package solved.impl;

import java.io.*;

public class B1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < inputs.length; j++) {
                arr[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        int max = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                // 각 꼭지점
                int acc = 1;
                // [0][2] j = 2;
                // 범위가 가능할 때 까지만 반복하면서 꼭지점을 늘려야함
                while((j + acc) < m && (i + acc) < n) {

                    boolean xAxis = arr[i][j] == arr[i][j + acc]; // 오른쪽 꼭지점
                    boolean yAxis = arr[i][j] == arr[i + acc][j]; // 아래 꼭지점
                    boolean xyAxis = arr[i][j] == arr[i + acc][j + acc]; // 오른쪽 아래 꼭지점

                    if(xAxis && yAxis && xyAxis) {
                        max = Math.max(acc, max);
                    }
                    acc++;
                }
            }
        }

        max++;

        bw.write(String.valueOf(max * max));

        bw.flush();
        bw.close();
    }
}
