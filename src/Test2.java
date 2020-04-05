import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    static int sorted[];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int t = input.nextInt();
        int[] result = new int[t];
        for (int i = 0; i < t; i++) {
            int[] cond = new int[3];
            for (int j = 0; j < 3; j++) {
                cond[j] = input.nextInt();
            }


        }

        for(int iter:result) System.out.println(iter);
    }

}


