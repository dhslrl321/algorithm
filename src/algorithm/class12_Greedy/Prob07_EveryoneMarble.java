package algorithm.class12_Greedy;

import java.util.Scanner;

public class Prob07_EveryoneMarble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            arr[i] += max;
        }
        int sum = 0;
        for(int iter : arr) {
            sum += iter;
        }
        sum -= 2 * max;
        System.out.println(sum);
    }
}
