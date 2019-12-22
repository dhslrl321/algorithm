package stage04_while_State;

import java.util.Scanner;

public class Prob03_PlusCycle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputNum = input.nextInt();
        int left, right;
        int tempNum = 0;
        int count = 0;
        while(tempNum != inputNum || count == 10){
            if(inputNum < 10){
                left = 0;
                right = inputNum;
                tempNum = left + right;
                count++;
            }else{
                left = (tempNum / 10) * 10;
                right = tempNum % 10;
                
                tempNum = left + right;
                count++;
            }
        }
        System.out.println(count);
    }
}
