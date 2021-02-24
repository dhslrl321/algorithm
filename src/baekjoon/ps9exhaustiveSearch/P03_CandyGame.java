package baekjoon.ps9exhaustiveSearch;

import java.io.*;

public class P03_CandyGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        char[][] board = new char[n][n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                board[i][j] = line[j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if(j + 1 < n){
                    swap(board, j, j + 1, i, i);
                    answer = Math.max(answer, countCandy(board));
                    swap(board, j, j + 1, i, i);
                }
                if(i + 1 < n) {
                    swap(board, j, j, i, i + 1);
                    answer = Math.max(answer, countCandy(board));
                    swap(board, j, j, i, i + 1);
                }

            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static int countCandy(char[][] arr) {
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            int temp = 1;
            for (int j = 1; j < arr.length; j++) {
                if(arr[i][j] == arr[i][j-1]) temp++;
                else temp = 1;

                count = Math.max(count, temp);
            }

            temp = 1;

            for (int j = 1; j < arr.length; j++) {
                if(arr[j][i] == arr[j-1][i]) temp++;
                else temp = 1;

                count = Math.max(count, temp);
            }
        }
        return count;
    }

    private static void swap(char[][] arr, int x1, int x2, int y1, int y2) {
        char temp = arr[y1][x1];
        arr[y1][x1] = arr[y2][x2];
        arr[y2][x2] = temp;
    }
}
