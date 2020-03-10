package solved_Tier.bronze3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prob01_Turtle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            list.add(input.nextInt());
        }

        list.sort(Collections.reverseOrder());

        int width = list.get(1);
        int height = list.get(3);

        System.out.println(width * height);
    }
}
