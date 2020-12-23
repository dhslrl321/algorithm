package baekjoon.solved_Tier.bronze.bronze1;

import java.util.Scanner;

public class Prob06_Club {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            String[] str = input.nextLine().split(" ");
            if(str[0].equals("#")) break;

            int age = Integer.parseInt(str[1]);
            int height = Integer.parseInt(str[2]);

            if(age > 17 || height >= 80) {
                str[1] = "Senior";
            }else {
                str[1] = "Junior";
            }
            System.out.printf("%s %s", str[0], str[1]);
            System.out.println();
        }
    }
}
