package stage.stage05_OneDimensionArray;

import java.util.Scanner;

public class Prob03_CountOfNumber {
    public static void main(String[] args) {

        int a, b, c; //입력 변수 a b c

        int result; // 곱의 결과값

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        result = a * b * c;

        int[] counts = new int[10];

        while (result > 0) {
            counts[result % 10]++;
            result /= 10;
        }

        for (int i = 0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }

    }
}
