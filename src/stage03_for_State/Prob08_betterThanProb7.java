package stage03_for_State;

import java.util.Scanner;

public class Prob08_betterThanProb7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();
        int left;
        int right;
        for(int i=1; i<=testCase; i++){
            left = input.nextInt();
            right = input.nextInt();
            System.out.println("Case #"+i+": "+left+" + "+right+" = "+(left+right));
        }
    }
}
