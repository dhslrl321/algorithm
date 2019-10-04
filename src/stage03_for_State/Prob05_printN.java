package stage03_for_State;

import java.util.Scanner;

public class Prob05_printN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
