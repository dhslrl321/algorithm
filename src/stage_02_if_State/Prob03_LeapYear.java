package stage_02_if_State;

import java.util.Scanner;

public class Prob03_LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if(year % 4 == 0 && year % 100 ==0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
