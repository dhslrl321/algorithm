package baekjoon.solved_Tier.bronze.bronze4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Prob02_ThreeDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(input.nextInt());
        }

        list.sort(Comparator.reverseOrder());

        if(list.get(0).equals(list.get(2))) System.out.println((list.get(0) * 1000) + 10000); // cond.1
        else if(list.get(0).equals(list.get(1))) System.out.println((list.get(0)*100) + 1000); // cond. 2
        else if(list.get(1).equals(list.get(2))) System.out.println((list.get(1)*100) + 1000); // cond. 2
        else System.out.println(list.get(0) * 100);
    }
}
