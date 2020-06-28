package olympiad.elementary;

import java.util.Arrays;
import java.util.Scanner;

public class Prob01_NumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String num = String.valueOf(a * b * c);
        String[] arr = num.split("");
        int[] count = new int[10];

        for (String s : arr) {
            count[Integer.parseInt(s)]++;
        }

        for(int iter : count) {
            System.out.println(iter);
        }
    }
}
