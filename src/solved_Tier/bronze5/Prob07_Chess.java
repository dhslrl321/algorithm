package solved_Tier.bronze5;

import java.util.Scanner;

public class Prob07_Chess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = {1, 1, 2, 2, 2, 8};
        int[] b = new int[6];

        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(a[i] - b[i] + " ");
        }
    }
}
