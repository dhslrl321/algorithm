package solved.nm;

import java.io.*;
import java.util.*;

public class P15649 {

    static int n;
    static int m;
    static int[] numbers = new int[8];
    static boolean[] check = new boolean[8];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");

        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        permutation(0, n, m);
    }

    static void permutation(int nowIndex, int maximumNumber, int wantedCount) {
        // 기저 조건
        if (nowIndex == wantedCount) {
            for (int number : numbers) {
                if (number != 0) System.out.print(number + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < maximumNumber; i++) {
            if (!check[i]) {
                check[i] = true;
                numbers[nowIndex] = i + 1;
                permutation(nowIndex + 1, maximumNumber, wantedCount);
                check[i] = false;
            }
        }
        return;
    }
}