package baekjoon.classification.class05_BruteForce;

import java.util.Scanner;

public class Prob02_DividePlus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int res = 0;

        int temp = x;

        int sum;

        while(temp >= 0){
            temp--;
            sum = temp;
            int comp = temp;
            while(comp > 0){
                sum += comp % 10;
                comp /= 10;
            }
            if (sum == x) res = temp;
        }
        System.out.println(res);
    }
}
