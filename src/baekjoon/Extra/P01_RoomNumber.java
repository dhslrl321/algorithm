package baekjoon.Extra;

import java.util.Arrays;
import java.util.Scanner;

public class P01_RoomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int original = input.nextInt();
        int n = original * 10;
        int[] number = new int[10];
        while((n /= 10) > 0) number[n % 10]++;

        int max = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i] > max) {
                if(i == 6 || i == 9) continue;
                else max = Math.max(max, number[i]);
            }
        }


        int a = number[6] + number[9];
        a += a % 2;
        a /= 2;
        max = Math.max(max, a);
        if(original == 0) System.out.println(1);
        else System.out.println(max);
    }
}
