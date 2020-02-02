package extraStagoe;

import java.util.Scanner;

public class SumOfNumber_11720 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();

        int num = input.nextInt();
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += String.valueOf(num).charAt(i);
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
