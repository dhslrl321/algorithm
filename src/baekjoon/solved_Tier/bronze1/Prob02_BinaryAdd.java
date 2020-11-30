package baekjoon.solved_Tier.bronze1;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class Prob02_BinaryAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        String m = input.next();

        int[] sum = new int[80];

        int max = Math.max(n.length(), m.length());

        int c = 0; // 자리 올림 변수

        int[] arrN = new int[max];
        int[] arrM = new int[max];

        arrN = generateArr(n, n.length(), max);
        arrM = generateArr(m, n.length(), max);

        for (int i = 0; i < max; i++) {
            sum[i] = arrN[i] + arrM[i] + c;
            if(sum[i] >= 2) {
                sum[i] -= 2;
                c = 1;
            }else {
                c = 0;
            }
        }
        
        if(c == 1) {
            sum[max] = 1;
            for (int i = max; i >= 0; i--) {
                System.out.println(sum[i]);
            }
        }else {
            for (int i = max - 1; i >= 0; i--) {
                System.out.println(sum[i]);
            }
        }
    }

    static int[] generateArr(String str, int length, int max) {
        int count = 0;
        int[] arr = new int[max];
        for (int i = length - 1; i >= 0 ; i--) {
            arr[count++] = str.charAt(i) - '0';
        }
        return arr;
    }
}
