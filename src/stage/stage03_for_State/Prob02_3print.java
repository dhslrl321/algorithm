package stage.stage03_for_State;

import java.util.Scanner;

public class Prob02_3print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();

        for (int i = 0; i < testCase; i++) {

            int a = input.nextInt();
            int b = input.nextInt();

            System.out.println(a + b);
        }
    }
}
