package stage04_while_State;

import java.util.Scanner;

public class Prob03_PlusCycle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputNum = input.nextInt();
        int left, right;
        int temp;

        if(inputNum < 10){
            left = 0;
            right = inputNum;
            temp = left + right;
        }else{
            left = inputNum / 10;
            right = inputNum % 10;
        }
    }
}
