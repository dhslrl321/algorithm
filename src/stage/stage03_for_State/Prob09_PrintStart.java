package stage.stage03_for_State;

import java.util.Scanner;

public class Prob09_PrintStart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();


        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
