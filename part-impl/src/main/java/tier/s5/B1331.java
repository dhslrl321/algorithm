package tier.s5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1331 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Pair now;

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
        List<Pair> available = new ArrayList<>();

        int[][] quadrant1 = {{1, 1}, {1, 1}};
        int[][] quadrant2 = {{1, -1}, {1, -1}};
        int[][] quadrant3 = {{-1, 1}, {-1, 1}};
        int[][] quadrant4 = {{-1, -1}, {-1, -1}};

        appendAvailableBy(pair, quadrant1, available);
        appendAvailableBy(pair, quadrant2, available);
        appendAvailableBy(pair, quadrant3, available);
        appendAvailableBy(pair, quadrant4, available);
        return false;
    }

    private static void appendAvailableBy(Pair pair, int[][] quadrant, List<Pair> available) {
        for (int i = 0; i < quadrant.length; i++) {
            int[] fixedX = {2, 1};
            int[] fixedY = {1, 2};

            for (int j = 0; j < 2; j++) {
                int xx = fixedX[j] * quadrant[0][j];
                int yy = fixedY[j] * quadrant[1][j];

                if (isValid(pair.x + xx, pair.y + yy)) {
                    available.add(new Pair(pair.x + xx, pair.y + yy));
                }
            }
        }
    }

    private static boolean isValid(int x, int y) {
        return false;
    }

    private static Pair getCoordinate(String input) {
        String[] split = input.split("");
        int x = split[0].charAt(0) - 'A';
        int y = split[1].charAt(0) - '1';
        return new Pair(x, y);
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
