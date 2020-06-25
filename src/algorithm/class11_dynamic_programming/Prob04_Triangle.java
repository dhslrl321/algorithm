package algorithm.class11_dynamic_programming;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Prob04_Triangle {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        bw.flush();
        bw.close();
    }
}
