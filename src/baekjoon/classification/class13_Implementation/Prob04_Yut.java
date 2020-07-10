package baekjoon.classification.class13_Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prob04_Yut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] answer = new int[3];
        for (int i = 0; i < 3; i++) {

            String[] a = br.readLine().split(" ");

            int[] arr = new int[4];

            for (int j = 0; j < 4; j++) {
                arr[j] = Integer.parseInt(a[j]);
            }
            for(int iter : arr){
                answer[i] += iter;
            }

            switch(answer[i]){
                case 0 :
                    System.out.println("D");
                case 1:
                    System.out.println("C");
                case 2:
                    System.out.println("B");
                case 3:
                    System.out.println("A");
                case 4:
                    System.out.println("E");
            }
        }



    }
}
