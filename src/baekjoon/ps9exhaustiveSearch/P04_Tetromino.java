package baekjoon.ps9exhaustiveSearch;

import java.io.*;
@SuppressWarnings("SpellCheckingInspection")
public class P04_Tetromino {
    static int[][] arr;
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] ms = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(ms[j]);
            }
        }

        int[][][] block = {
                {{0,1}, {0,2}, {0,3}},
                {{1,0}, {2,0}, {3,0}},
                {{1,0}, {1,1}, {1,2}},
                {{0,1}, {1,0}, {2,0}},
                {{0,1}, {0,2}, {1,2}},
                {{1,0}, {2,0}, {2,-1}},
                {{0,1}, {0,2}, {-1,2}},
                {{1,0}, {2,0}, {2,1}},
                {{0,1}, {0,2}, {1,0}},
                {{0,1}, {1,1}, {2,1}},
                {{0,1}, {1,0}, {1,1}},
                {{0,1}, {-1,1}, {-1,2}},
                {{1,0}, {1,1}, {2,1}},
                {{0,1}, {1,1}, {1,2}},
                {{1,0}, {1,-1}, {2,-1}},
                {{0,1}, {0,2}, {-1,1}},
                {{0,1}, {0,2}, {1,1}},
                {{1,0}, {2,0}, {1,1}},
                {{1,0}, {2,0}, {1,-1}},
        };


        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                for (int k = 0; k < 19; k++) {
                    for (int l = 0; l < 3; l++) {
                        int sum = getTetroMinoSum(block[k][l][0], block[k][l][1], j, i);
                        answer = Math.max(answer, sum);
                    }
                }

            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static int getTetroMinoSum(int dx, int dy, int x, int y) {
        int sum = 0;

        int xx = dx + x;
        int yy = dy + y;

        if(0 <= xx && 0 <= yy && xx < m && yy < n) {
            sum += arr[yy][xx];
        }

        return sum;
    }
}
