package baekjoon.classification.class04_Sort;

import java.util.*;
import java.util.Scanner;

public class Prob05_Treasure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            aList.add(input.nextInt());
        }

        for (int i = 0; i < n; i++) {
            bList.add(input.nextInt());
        }

        ArrayList<Integer> tempList = new ArrayList<>();
        tempList = bList;

        tempList.sort(Collections.reverseOrder());
        Collections.sort(aList);

        int mult = 1;

        for (int i = 0; i < aList.size(); i++) {
            mult += aList.get(i) * tempList.get(i);
        }
        mult = mult - 1;

        System.out.println(mult);
    }
}
