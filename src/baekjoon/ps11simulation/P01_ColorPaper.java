package baekjoon.ps11simulation;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class P01_ColorPaper {

    static int[][] map = new int[101][101];

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        int[][] colorPaper = new int[size][2];

        for (int i = 0; i < size; i++) {
            String[] xy = br.readLine().split(" ");
            colorPaper[i][0] = Integer.parseInt(xy[0]);
            colorPaper[i][1] = Integer.parseInt(xy[1]);

            drawPaper(colorPaper[i][0], colorPaper[i][1]);
        }

        int answer = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(validation(i, j)) {
                    for (int k = 0; k < 4; k++) {
                        int xx = dx[k] + j;
                        int yy = dy[k] + i;

                        if(map[i][j] == 1 && map[yy][xx] != 1) answer++;
                    }
                }
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
    
    private static boolean validation(int x, int y) {

        return 0 < x && x <= 101 && 0 < y && y <= 101;
    }

    private static void drawPaper(int x, int y) {
        for (int i = x; i < x + 10; i++) {
            for (int j = y; j < y + 10; j++) {
                map[i][j] = 1;
            }
        }
    }
}
