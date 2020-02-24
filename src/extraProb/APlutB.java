package extraProb;

import java.util.Arrays;
import java.util.Scanner;

public class APlutB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String[] a = new String[t];

        for (int i = 0; i < t; i++) {
            a[i] = input.next();
        }

        for (int i = 0; i < t; i++) {
            int right = Integer.parseInt(Arrays.toString(a[i].split(",")));
            int left = Integer.parseInt(String.valueOf(a[i].indexOf(1)));
            System.out.println(right);
        }


    }
}
