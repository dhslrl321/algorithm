package tier.s3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2477 {

    private static final int _0 = 0;
    private static final int _90 = 90;
    private static final int _180 = 180;
    private static final int _270 = 270;

    public static void main(String[] args) throws IOException {

        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        Pair[] pairs = new Pair[6];
        
        for (int i = 0; i < 6; i++) {
            String[] input = br.readLine().split(" ");
            pairs[i] = new Pair(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }

        int degree = getDegree(pairs);
        Pair[] aligned = align(pairs, degree);

        answer = calculateArea(aligned, k);

        bw.write(String.valueOf(answer));
        bw.flush();
    }

    private static int getDegree(Pair[] pairs) {
        int[] numbers = new int[4];

        for (Pair pair : pairs) {
            numbers[(pair.left - 1)]++;
        }

        if (numbers[0] == 2 && numbers[2] == 2) {
            return _0;
        } else if (numbers[0] == 2 && numbers[3] == 2) {
            return _90;
        } else if (numbers[3] == 2 && numbers[1] == 2) {
            return _180;
        } else if (numbers[2] == 2 && numbers[1] == 2) {
            return _270;
        }

        throw new IllegalStateException();
    }

    private static Pair[] align(Pair[] pairs, int degree) {
        Pair[] newPair = new Pair[4];
        int index = 0;
        int assignCount = 0;
        boolean active = false;
        switch (degree) {
            case _0: { // 3131 => 4
                int key = 4;
                while (assignCount < 4) {
                    Pair pair = pairs[index % 6];
                    if (pair.left == key) active = true;
                    if (active && (pair.left == 3 || pair.left == 1)) {
                        newPair[assignCount] = new Pair(pair.left, pair.right);
                        assignCount++;
                    }
                    index++;
                }
                return newPair;
            }
            case _90: { // 1414 => 2
                int key = 2;
                while (assignCount < 4) {
                    Pair pair = pairs[index % 6];
                    if (pair.left == key) active = true;
                    if (active && (pair.left == 1 || pair.left == 4)) {
                        newPair[assignCount] = new Pair(pair.left, pair.right);
                        assignCount++;
                    }
                    index++;
                }
                return newPair;
            }
            case _180: { // 4242 => 3
                int key = 3;
                while (assignCount < 4) {
                    Pair pair = pairs[index % 6];
                    if (pair.left == key) active = true;
                    if (active && (pair.left == 4 || pair.left == 2)) {
                        newPair[assignCount] = new Pair(pair.left, pair.right);
                        assignCount++;
                    }
                    index++;
                }
                return newPair;
            }
            case _270: { // 2323 => 1
                int key = 1;
                while (assignCount < 4) {
                    Pair pair = pairs[index % 6];
                    if (pair.left == key) active = true;
                    if (active && (pair.left == 2 || pair.left == 3)) {
                        newPair[assignCount] = new Pair(pair.left, pair.right);
                        assignCount++;
                    }
                    index++;
                }
                return newPair;
            }
            default:
                break;
        }

        return new Pair[4];
    }

    private static int calculateArea(Pair[] aligned, int k) {
        int rootArea = (aligned[0].right + aligned[2].right) * (aligned[1].right + aligned[3].right);
        int notAvailable = (aligned[1].right * aligned[2].right);
        return (rootArea - notAvailable) * k;
    }

    private static class Pair {

        int left;
        int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }
}
