package stage07_String;

import java.util.Arrays;
import java.util.Scanner;

public class Prob02_SumOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();

        String numString = input.next();
        int sum = 0;
        char[] ascii = numString.toCharArray();

        for(int i=0; i<ascii.length; i++){
            sum += Integer.parseInt(String.valueOf(ascii[i]));
        }
        System.out.println(sum);
    }
}


