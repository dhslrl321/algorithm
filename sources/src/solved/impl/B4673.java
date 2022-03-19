package solved.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * keep
 * - n 의 수에 대해서 각 자리수를 더해야 하는 상황에서는 String 으로 변환하고 배열로 만든 것이 key point 였다.
 * - 이번에도 역시 문제를 먼저 이해하려고 했던 것이 좀 좋았다.
 *
 * problem
 * - 딱히 없다.
 *
 * try
 * - 다음에는 먼저 입력값을 만족시키는 코드를 짜고 생각해보는 것도 좋을것 같다.
 */
public class B4673 {

    private static boolean[] check = new boolean[10001];

    public static void main(String[] args) {
        for (int i = 1; i < 10001; i++) {
            checkSelfNumber(i);
        }

        printUnckeckedIndex();
    }

    private static void checkSelfNumber(int start) {
        int checkIndex = start;

        String[] number = String.valueOf(start).split("");
        
        for (String n : number) {
            checkIndex += Integer.parseInt(n);
        }

        if (checkIndex < 10001) {
            check[checkIndex] = true;
        }
    }

    private static void printUnckeckedIndex() {
        for (int i = 1; i < 10001; i++) {
            if (check[i]) continue;
            System.out.println(i);
        }
    }
}
