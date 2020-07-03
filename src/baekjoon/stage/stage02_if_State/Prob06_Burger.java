package baekjoon.stage.stage02_if_State;

import java.util.Arrays;
import java.util.Scanner;

public class Prob06_Burger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] burger = new int[3];
        int[] beverage = new int[2];

        for (int i = 0; i < burger.length; i++) {
            burger[i] = input.nextInt();
        }

        for (int i = 0; i < beverage.length; i++) {
            beverage[i] = input.nextInt();
        }

        Arrays.sort(burger);
        Arrays.sort(beverage);

        System.out.println(burger[0] + beverage[0] - 50);
    }
}
