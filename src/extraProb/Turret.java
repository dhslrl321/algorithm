package extraProb;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Turret {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] x1 = new int[t];
        int[] x2 = new int[t];
        int[] y1 = new int[t];
        int[] y2 = new int[t];
        int[] r1 = new int[t];
        int[] r2 = new int[t];

        for (int i = 0; i < t; i++) {
            x1[i] = input.nextInt();
            x2[i] = input.nextInt();
            y1[i] = input.nextInt();
            y2[i] = input.nextInt();
            r1[i] = input.nextInt();
            r2[i] = input.nextInt();
        }


        // x, y좌표 구하기
        for (int i = 0; i < t; i++) {

            double x = Math.pow(x2[i], 2) - Math.pow(x1[i], 2);
            double y = Math.pow(y2[i], 2) - Math.pow(y1[i], 2);

            int xy = (int)Math.sqrt(x+y);
            int sum = r1[i] + r2[i];
            if(x1[i] == x2[i] && y1[i] == y2[i] && r1[i] == r2[i]) System.out.println(-1);
            else if(sum == xy) System.out.println(1);
            else if(sum > xy) System.out.println(2);
            else System.out.println(0);

        }

        // 빗변 구하기

        // r 값 비교문 만들기

        // 출력

    }
}
