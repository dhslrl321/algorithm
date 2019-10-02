package stage03_for_State;

import java.util.Scanner;

public class Prob01_Multiplication_Table {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dan = input.nextInt();

        for(int i=1; i<10; i++){
            System.out.printf("%d * %d = %d\n",dan, i, dan*i);
        }
    }
}
