package solved.nm;

import java.io.*;
import java.util.*;

public class P15650 {

    static int n;
    static int m;
    static int[] numbers = new int[9];
    static boolean[] check = new boolean[9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");

        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        permutation(1, 0);
    }

    static void permutation(int at, int depth) {
        // 기저 조건
        if (depth == m) {
            for (int number : numbers) {
                if (number != 0) System.out.print(number + " ");
            }
            System.out.println();
            return;
        }

        for (int i = at; i <= n; i++) {
            numbers[depth] = i;
            permutation(i + 1, depth + 1);
        }
        return;
    }
}