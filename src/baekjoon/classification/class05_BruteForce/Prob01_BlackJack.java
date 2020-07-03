package baekjoon.classification.class05_BruteForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prob01_BlackJack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum <= m) {
                        list.add(sum);
                    }
                }
            }
        }
        int minIdx = 0;
        try {
            int min = m - list.get(0);
            minIdx = 0;
            for (int i = 0; i < list.size(); i++) {
                if(min > m - list.get(i)) minIdx = i;
                //System.out.println(list.get(i));
            }
            Collections.sort(list);
            System.out.println(list.get(list.size()));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }


}