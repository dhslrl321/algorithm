package baekjoon.solved_Tier.bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class Prob06_Cup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] cups = {true, false, false};
        int n = input.nextInt();
        
        while(n-- > 0) {
            int x = input.nextInt();
            int y = input.nextInt();

            boolean temp = cups[x-1];
            cups[x-1] = cups[y-1];
            cups[y-1] = temp;
        }
        int index = 1;
        for(boolean iter : cups) {
            if(iter) {
                System.out.println(index);
            }
            index++;
        }
    }
}
