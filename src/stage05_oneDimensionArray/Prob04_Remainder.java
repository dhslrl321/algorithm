package stage05_oneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class Prob04_Remainder {
    public static void main(String[] args) {
        /*
        *  right = 10 number get (Should be received in an array)
        *  left = 42 Fixed Number
        *  remainder[] = 42 remainder arr
        *  count = answer count(Dif values)
        * */
        Scanner input = new Scanner(System.in);
        int[] right = new int[10];
        int[] remainder = new int[42];
        int left = 42;
        int countFlag = 0;
        for(int i=0; i<right.length; i++){
            right[i] = input.nextInt();
            remainder[right[i] % left] = 1;
        }

        for(int i=0; i<remainder.length; i++){
            if(remainder[i] == 1){
                countFlag++;
            }
        }
        System.out.println(countFlag);

    }
}
