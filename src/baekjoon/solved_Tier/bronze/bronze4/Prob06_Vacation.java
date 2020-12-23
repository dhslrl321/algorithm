package baekjoon.solved_Tier.bronze.bronze4;

import java.util.Scanner;

public class Prob06_Vacation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int l = input.nextInt();
        int lang = input.nextInt();
        int math = input.nextInt();
        int langL = input.nextInt();
        int mathL = input.nextInt();
        int count = 0;

        while(lang >= 0 && math >= 0){
            lang -= langL;
            math -= mathL;
            count++;
        }

        System.out.println(l - count - 1);
    }
}
