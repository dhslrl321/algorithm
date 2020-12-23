package baekjoon.solved_Tier.bronze.bronze1;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Prob03_Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            char[] arr = input.nextLine().toCharArray();
            if(arr.length == 1) {
                if(arr[0] - '0' == 0) break;
                else {
                    System.out.println("yes");
                }
            }

            int mid = arr.length / 2;

            for (int i = 0; i < mid; i++) {
                int start = arr[i] - '0';
                int reverse = arr[(arr.length - 1) - i] - '0';
                if(start != reverse) {
                    System.out.println("no");
                    break;
                }
                if(i == mid - 1) {
                    System.out.println("yes");
                }
            }
        }
    }
}
