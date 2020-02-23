package algorithm.class04_Sort;

import java.util.*;

public class Prob08_CoordinationSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[][] coordination = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                coordination[i][j] = input.nextInt();
            }
        }

    }
}
