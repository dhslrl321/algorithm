package baekjoon.solved_Tier.bronze4;

import java.util.Scanner;

public class Prob05_AFC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n = input.nextInt();
        double m = input.nextInt();

        double a = (n + m) / 2;
        double b = (n - m) / 2;

        if((n+m) % 2 != 0 || (n-m) % 2 != 0) System.out.println(-1);
        else{
            if(n >= 0 && n >= 0){
                if(n >= 0 && b >= 0) {
                    if(n >= m) System.out.println(a + " " + b);
                    else System.out.println(a + " " + b);
                }else System.out.println(-1);
            }
        }
    }
}
