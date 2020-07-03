package baekjoon.extraProb;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Auction {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int maxPrice = input.nextInt();

        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        ArrayList<Integer> newList;

        newList = (ArrayList<Integer>) list.parallelStream().distinct().collect(Collectors.toList());


        System.out.println(newList);
    }
}
