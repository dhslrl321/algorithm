package solved.greedy;

import java.io.*;
import java.util.Scanner;

public class B1449 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int l = input.nextInt();

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int answer = 1;

        double now = arr[0] - 0.5 + l;

        for (int i = 1; i < arr.length; i++) {
            if(now < (arr[i] + 0.5)) {
                now = (arr[i] - 0.5 + l);
                answer++;
            }
        }
        System.out.println(answer);
    }
}
