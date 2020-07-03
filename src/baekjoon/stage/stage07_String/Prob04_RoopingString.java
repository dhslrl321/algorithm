package baekjoon.stage.stage07_String;

import java.util.Scanner;

public class Prob04_RoopingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();

        int[] round = new int[testCase];
        String[] str = new String[testCase];

        for(int i=0; i<testCase; i++){
            round[i] = input.nextInt();
            str[i] = input.next();
        }

        for(int i=0; i<testCase; i++){
            for(int j=0; j<str[i].length(); j++){
                for(int k=0; k<round[i]; k++){
                    System.out.print(str[i].charAt(j));
                }
            }
            System.out.println();
        }

    }
}
