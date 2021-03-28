package baekjoon.ps11simulation;

import java.io.*;
import java.util.Arrays;

public class P02_King {

    private static int[][] movements = {
            {1, 0}, // 0 : R 오른쪽으로
            {-1, 0}, // 1 : L 왼쪽으로
            {0, -1}, // 2 : B 아래로
            {0, 1}, // 3: T 위로
            {1, -1}, // 4 : RT 오른쪽 대각선 위로
            {-1, -1}, // 5 : LT 왼쪽 대각선 위로
            {1, 1}, // 6 : RB 오른쪽 아래 대각
            {-1, 1} // 7 : LB 왼쪽 아래 대각
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        String[] kingPosition = inputs[0].split("");
        String[] stonePosition = inputs[1].split("");

        int loop = Integer.parseInt(inputs[2]);

        while(loop-- > 0) {

            String move = br.readLine();

            int kingX = Math.abs((kingPosition[0].charAt(0) - 65) - 8) - 1;
            int kingY = Integer.parseInt(kingPosition[1]) - 1;

            int stoneX = Math.abs((stonePosition[0].charAt(0) - 65) - 8) - 1;
            int stoneY = Integer.parseInt(stonePosition[1]) - 1;

            int movementIndex = getMovement(move);

            if(mapValidator(movements[movementIndex], kingX, kingY)) {
                // king 이 움직일 수 있는 경우
                int xx = kingX + movements[movementIndex][0];
                int yy = kingY + movements[movementIndex][1];

                if(xx == stoneX && yy == stoneY) {
                    // king 이 움직이려는 곳에 stone 이 있는 경우
                    // stone 에 대한 validation 도 해야함
                    if(mapValidator(movements[movementIndex], stoneX, stoneY)) {
                        kingX = stoneX;
                        kingY = stoneY;

                        stoneX += movements[movementIndex][0];
                        stoneY += movements[movementIndex][1];
                    }
                }else {
                    kingX = xx;
                    kingY = yy;
                }

                kingPosition[0] = String.valueOf((char)Math.abs(kingX - 7) + 65);
                kingPosition[1] = String.valueOf(kingY + 1);

                stonePosition[0] = String.valueOf((char)Math.abs(stoneX - 7) + 65);
                stonePosition[1] = String.valueOf(stoneY + 1);
            }

        }
        System.out.println(Character.toString(Integer.parseInt(kingPosition[0])) + Integer.parseInt(kingPosition[1]));
        System.out.println(Character.toString(Integer.parseInt(stonePosition[0])) + Integer.parseInt(stonePosition[1]));
    }

    private static boolean mapValidator(int[] movement, int x, int y) {
        int xx = movement[0] + x;
        int yy = movement[1] + y;

        return 0 <= xx && xx < 8 && yy >= 0 && yy < 8;
    }

    private static int getMovement(String move) {
        if(move.equals("R")) {
            return 0;
        }else if(move.equals("L")) {
            return 1;
        }else if(move.equals("B")) {
            return 2;
        }else if(move.equals("T")) {
            return 3;
        }else if(move.equals("RT")) {
            return 4;
        }else if(move.equals("LT")) {
            return 5;
        }else if(move.equals("RB")) {
            return 6;
        }else if(move.equals("LB")) {
            return 7;
        }
        else return Integer.MAX_VALUE;
    }
}
