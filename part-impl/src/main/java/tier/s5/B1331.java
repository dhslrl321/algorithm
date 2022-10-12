package tier.s5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class B1331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isValid = true;

        int size = 36;
        String[] moves = new String[size];

        for (int i = 0; i < size; i++) {
            moves[i] = br.readLine();
        }

        String prev = moves[0];

        for (int i = 1; i < moves.length; i++) {
            if (!available(convert(prev), convert(moves[i]))) {
                isValid = false;
                break;
            }
            prev = moves[i];
        }

        String answer = isValid ? "Valid" : "Invalid";

        bw.write(answer);
        bw.flush();
        bw.close();
    }

    private static Pair convert(String move) {
        String[] split = move.split("");
        return new Pair(split[0].charAt(0) - 'A', split[1].charAt(0) - '1');
    }

    private static boolean available(Pair prev, Pair now) {
        List<Pair> candidates = getCandidates(prev);
        return candidates.contains(now);
    }

    private static List<Pair> getCandidates(Pair prev) {
        List<Pair> candidates = new ArrayList<>();
        final int[] deltaX = {1, 2, 2, 1, -2, -2, -2, -1};
        final int[] deltaY = {2, 1, -1, -2, -1, -1, 1, 2};

        for (int i = 0; i < deltaX.length; i++) {
            int xx = deltaX[i] + prev.left;
            int yy = deltaY[i] + prev.right;

            if (isValidPosition(xx, yy)) {
                candidates.add(new Pair(xx, yy));
            }
        }
        return candidates;
    }

    private static boolean isValidPosition(int xx, int yy) {
        return (0 <= xx && xx < 6) && (0 <= yy && yy < 6);
    }

    private static class Pair {
        int left;
        int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair pair = (Pair) o;
            return left == pair.left && right == pair.right;
        }
    }
}
