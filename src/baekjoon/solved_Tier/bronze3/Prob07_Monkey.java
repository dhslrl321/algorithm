package baekjoon.solved_Tier.bronze3;

import java.util.Scanner;

public class Prob07_Monkey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int end = Math.min(a, b);
        int start = Math.max(a, b);

        int count = 0;

        while(start-end >= 4) {
            count++;
            start += 4;
            if(start == end) {
                break;
            }
            if(start-end < 4) {
                count += start-end;
                break;
            }
        }
        System.out.println(count);
    }
}
