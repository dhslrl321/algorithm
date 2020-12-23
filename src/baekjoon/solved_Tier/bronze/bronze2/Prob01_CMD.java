package baekjoon.solved_Tier.bronze.bronze2;

import java.util.Scanner;

public class Prob01_CMD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = input.next();
        }

        char[] comp = str[0].toCharArray();
        for (int i = 1; i < n; i++) {

            char[] temp = str[i].toCharArray();

            for (int j = 0; j < temp.length; j++) {
                if (temp[j] != comp[j]){
                   comp[j] = '?';
                }
            }
        }

        for(char iter : comp) System.out.print(iter);
    }
}
