package stage_02_if_State;

import java.util.Scanner;

public class Prob04_Alram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int min = input.nextInt();
        int solution = (hour*60) + min - 45;

        int solHour;
        int solMin;
        if(solution <= 0){
            solHour = 23;
            solMin = 60 - (solution % 60);
        }else{
            solHour = solution / 60;
            solMin = solution % 60;
        }
        System.out.print(solHour+" "+ solMin);
    }
}
