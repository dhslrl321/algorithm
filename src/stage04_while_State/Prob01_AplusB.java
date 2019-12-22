package stage04_while_State;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob01_AplusB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int left;
        int right;

        while(true){
            left = input.nextInt();
            right = input.nextInt();

            if(left == 0 && right == 0) break;
            System.out.println(left + right);
        }

    }
}
