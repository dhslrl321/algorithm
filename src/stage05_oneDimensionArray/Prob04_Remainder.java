package stage05_oneDimensionArray;

import java.util.Scanner;

public class Prob04_Remainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] right = new int[10];
        for(int i=0; i<right.length; i++){
            right[i] = input.nextInt();
        }
        int left = 42, count = 10;
        int[] arr = new int[41];
        int ans = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                ans++;
            }
        }

        System.out.println(ans);
    }
}
