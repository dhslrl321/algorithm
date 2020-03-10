package solved_Tier.bronze5;

import java.util.Scanner;

public class Prob08_Errands {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[4];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}
