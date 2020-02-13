package stage.stage02_if_State;

import java.util.Scanner;

public class Prob05_Three_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if ((y <= x && x <= z) || (z <= x && x <= y)) {
            System.out.println(x);
        } else if ((x <= y && y <= z) || (z <= y && y <= x)) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}
