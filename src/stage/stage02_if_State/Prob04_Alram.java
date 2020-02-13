package stage.stage02_if_State;

import java.util.Scanner;

public class Prob04_Alram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int min = input.nextInt();
        int solution = (hour * 60) + min - 45;

        int solHour = solution / 60;
        int solMin = solution % 60;

        if (solution < 0) {
            solution = (60 * 24) + min - 45;
            solHour = solution / 60;
            solMin = solution % 60;
        }

        System.out.print(solHour + " " + solMin);
    }
}
