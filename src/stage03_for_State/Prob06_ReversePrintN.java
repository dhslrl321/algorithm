package stage03_for_State;

import java.util.Scanner;

public class Prob06_ReversePrintN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i=n; i>=1; i--){
            System.out.println(i);
        }
    }
}
