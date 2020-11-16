package baekjoon.classification.class05_BruteForce;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class Prob12_NM1 {
    static boolean[] check = new boolean[10]; // index 가 10 까지니까
    static int[] ans = new int[10]; // 몰라 아직
    public static void main(String[] args) {
        int n = 5;
        int m = 3;

        go(0, n, m);
    }

    static void go(int index, int n, int m) {
        if(index == m) { // index 가 반복하다가 조건에서 나온 m 까지 반복을 끝내면
            System.out.println(Arrays.toString(ans));
            return ;
        }

        for (int i = 1; i <= n; i++) { // 숫자만큼의 배열 인덱스
            if(check[i]) continue;
            check[i] = true; ans[index] = i;
            go(index + 1, n, m);
            check[i] = false;
        }
    }
}
