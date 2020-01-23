package stage05_oneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class Prob06_OXQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int resultNum = input.nextInt();
        String[] result = new String[resultNum];

        /*OX arr*/
        for(int i=0; i<result.length; i++){
            result[i] = input.next();
        }



    }
}
