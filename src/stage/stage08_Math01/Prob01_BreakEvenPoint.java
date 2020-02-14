package stage.stage08_Math01;

import java.util.Scanner;

public class Prob01_BreakEvenPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int standingCharge = input.nextInt();
        int variableCharge = input.nextInt();
        int charge = input.nextInt();

        if (variableCharge < charge) {
            int profit = charge - variableCharge;
            int acc = 0;
            int count = 0;

            while(acc <= standingCharge){
                acc += profit;
                count++;
            }
            System.out.println(count);
        }else System.out.println(-1);
    }
}
