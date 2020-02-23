package extraProb;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r1 = input.nextInt();

        int s = input.nextInt();

        int r2 = (2*s) - r1;

        System.out.println(r2);
    }
}
