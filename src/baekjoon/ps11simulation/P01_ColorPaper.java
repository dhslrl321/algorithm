package baekjoon.ps11simulation;

import java.io.*;

public class P01_ColorPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        int[][] colorPaper = new int[size][2];

        for (int i = 0; i < size; i++) {
            String[] xy = br.readLine().split(" ");
            colorPaper[i][0] = Integer.parseInt(xy[0]);
            colorPaper[i][1] = Integer.parseInt(xy[1]);
        }

        int totalSize = 40 * size;
        int overlappedSize = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i != j) {
                    if(isOverlapped(colorPaper[i], colorPaper[j])) {

                        int minX = Math.min(colorPaper[i][0], colorPaper[j][0]);
                        int minY = Math.min(colorPaper[i][1], colorPaper[j][1]);

                        int maxX = Math.max(colorPaper[i][0], colorPaper[j][0]);
                        int maxY = Math.max(colorPaper[i][1], colorPaper[j][1]);

                        overlappedSize += (minX + 10) - maxX;
                        overlappedSize += (maxY + 10) - minY;
                    }
                }
            }
        }
        bw.write(String.valueOf(totalSize - overlappedSize));

        bw.flush();
        bw.close();
    }

    private static boolean isOverlapped(int[] base, int[] target) {

        int baseX = Math.min(base[0], target[0]);
        int baseY = Math.min(base[1], target[1]);

        int targetX = Math.max(base[0], target[0]);
        int targetY = Math.max(base[1], target[1]);

        if((baseX + 10) > targetX && (baseY + 10) > targetY){
            return true;
        }else return false;
    }
}
