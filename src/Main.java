import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int[][] movements = {
            // {x, y}
            {1, 0}, // 0 : R 오른쪽으로
            {-1, 0}, // 1 : L 왼쪽으로
            {0, 1}, // 2 : B 아래로
            {0, -1}, // 3: T 위로
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
            // A1  x : 1  y : A
            int kingX = Integer.parseInt(kingPosition[1]) - 1;
            int kingY = Math.abs((kingPosition[0].charAt(0) - 65) - 8) - 1;

            int stoneX = Integer.parseInt(stonePosition[1]) - 1;
            int stoneY = Math.abs((stonePosition[0].charAt(0) - 65) - 8) - 1;

            int movementIndex = getMovement(move);

            if(mapValidator(movements[movementIndex], kingX, kingY)) {
                int xx = kingX + movements[movementIndex][0];
                int yy = kingY + movements[movementIndex][1];

                if(xx == stoneX && yy == stoneY) {
                    if(mapValidator(movements[movementIndex], stoneX, stoneY)) {
                        kingX = stoneX;
                        kingY = stoneY;


                        stoneX += movements[movementIndex][0];
                        stoneY += movements[movementIndex][1];
                    }else {
                        // validation 이 안되는 경우 라면 아무것도 움직이면 안됨
                    }
                }else {
                    kingX = xx;
                    kingY = yy;
                }
            }

            kingPosition[0] = String.valueOf((char)(Math.abs(kingY - 7) + 65));
            kingPosition[1] = String.valueOf(kingX + 1);

            stonePosition[0] = String.valueOf((char)(Math.abs(stoneY - 7) + 65));
            stonePosition[1] = String.valueOf(stoneX + 1);
        }

        System.out.println(Arrays.toString(kingPosition));
        System.out.println(Arrays.toString(stonePosition));
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
