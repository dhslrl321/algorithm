package baekjoon.classification.class04_Sort;

import java.util.Scanner;
import java.util.*;

public class prob01_SortingNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        Collections.sort(list);

        for(int i : list) System.out.println(i);
    }
}
