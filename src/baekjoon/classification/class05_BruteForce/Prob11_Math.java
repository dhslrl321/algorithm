package baekjoon.classification.class05_BruteForce;


import java.util.Scanner;

//두 정수 n과 m이 주어졌을 때, 0 < a < b < n인 정수 쌍 (a, b) 중에서 (a2+b2+m)/(ab)가 정수인 쌍의 개수를 구하는 프로그램을 작성하시오.
public class Prob11_Math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int ans = 0;
            int n = input.nextInt();
            int m = input.nextInt();

            for (int j = 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(((j*j + k*k + m) % (j*k) == 0)) ans++;
                }
            }
            System.out.println(ans);
        }

    }
}
