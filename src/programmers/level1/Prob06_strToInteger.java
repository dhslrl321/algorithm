package programmers.level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prob06_strToInteger {
    public static void main(String[] args) {
        String[] str = {"1234", "-1234", "-1"};
        int[] answer = new int[str.length];
        int index = 0;
        for(String iter : str) {
            if(iter.startsWith("-")) {
                // negative
                iter = iter.replace("-", "");
                answer[index++] = -Integer.parseInt(iter);
            }else {
                // positive
                answer[index++] = Integer.parseInt(iter);
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
