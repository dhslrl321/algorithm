package stage.stage08_Math01;

import java.util.Scanner;

public class Prob02_SugarDelivery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sugar = input.nextInt();

        if((sugar % 5 == 0) && (sugar % 3 == 0)){

        }else System.out.println(-1);
    }
}
