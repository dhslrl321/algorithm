package baekjoon.solved_Tier.bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class Prob01_Castle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();
        boolean[][] map = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String line = input.nextLine();
            char[] part = line.toCharArray();
            for (int j = 0; j < part.length; j++) {
                map[i][j] = part[j] == '.';
            }
        }

        int count = 0;

        for (int i = 0; i < map.length; i++) {
            boolean flag = false;
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j]) flag = true;
            }
            if(!flag) count++;
        }
    }
}
