package stage03_for_State;

import java.util.Scanner;

public class Prob09_PrintStart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();

        for(int i=0; i<=count; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
