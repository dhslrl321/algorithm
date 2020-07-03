package baekjoon.classification.class09_Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class Prob01_Hanoi {
    static BigInteger count = BigInteger.ZERO;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, 1, 3, 2);
        if(n < 21){
            System.out.println(count);
            System.out.println(sb.toString());
        }else {
            System.out.println(count);
        }

    }
    /*20 under*/
    static void hanoi(int n, int start, int end, int temp){
        count = count.add(BigInteger.valueOf(1));
        if(n == 1){
            sb.append(start);
            sb.append(" ");
            sb.append(end);
            sb.append("\n");
            return;
        }
        hanoi(n-1, start, temp, end);
        sb.append(start);
        sb.append(" ");
        sb.append(end);
        sb.append("\n");
        hanoi(n-1, temp, end, start);
    }
}
