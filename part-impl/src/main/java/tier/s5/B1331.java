package tier.s5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B1331 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String input = scanner.nextLine();
            Pair pair = getCoordinate(input);

            if (!available(pair)) {
                System.out.println("Invalid");
                return;
            }
            System.out.println("Valid");
        }
    }

    private static boolean available(Pair pair) {
        int[] fixedX = {2, 1};
        int[] fixedY = {1, 2};

        int[][] quadrant1 = {{1, 1}, {1, 1}};
        int[][] quadrant2 = {{1, -1}, {1, -1}};
        int[][] quadrant3 = {{-1, 1}, {-1, 1}};
        int[][] quadrant4 = {{-1, -1}, {-1, -1}};

        for (int i = 0; i < 4; i++) {
            int x = pair.x;
            int y = pair.y;


        }
        /**
         * fixed
         * 2 1
         * 1 2
         * 2 1 *1 *1
         * 1 2 *1 *1
         *
         * 2 1 *1 *-1
         * 1 2 *1 *-1
         *
         * 2 1 *-1 *1
         * 1 2 *-1 *1
         *
         * 2 1 *-1 *-1
         * 1 2 *-1 *-1
         */
        return false;
    }

    private static Pair getCoordinate(String input) {
        String[] split = input.split("");
        int x = split[0].charAt(0) - 'A';
        int y = split[1].charAt(0) - '1';
        return new Pair(x, y);
    }

    private static String convert(Pair pair) {
        
    }

    private static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
