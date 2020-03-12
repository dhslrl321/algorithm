
import java.util.Scanner;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(n / (k-1));
       /* Arrays.sort(arr);

        int min = arr[0];
        int j;
        *//*int check = (n - k) / (k - 1) + 1;
        int count = 0;
        for (int i = 0; i < check; i = i + k - 1) {
            for (j = 0; j < k; j++) {

                if(i == 0) arr[i] = min;

                else arr[i - 1] = min;

                count++;
            }
        }*//*
        int check = arr.length % k;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr.length - i == check) {
                count++;
                break;
            }
            else{
                for (j = 0; j < k; j++) {

                    arr[i] = min;

                    count++;
                }
                i += j;
            }
        }*/

    }

}
