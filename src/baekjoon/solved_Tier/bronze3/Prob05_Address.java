package baekjoon.solved_Tier.bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class Prob05_Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            int num = input.nextInt();
            int width = 0;
            if(num == 0) {
                break;
            }else {
                char[] nums = String.valueOf(num).toCharArray();
                int blank = nums.length + 1;
                width += blank;

                for(char iter : nums) {
                    int a = Integer.parseInt(String.valueOf(iter));
                    switch(a) {
                        case 1: {
                            width += 2;
                            break;
                        }
                        case 0: {
                            width += 4;
                            break;
                        }
                        default: {
                            width += 3;
                            break;
                        }
                    }
                }

                System.out.println(width);
            }
        }
    }
}
