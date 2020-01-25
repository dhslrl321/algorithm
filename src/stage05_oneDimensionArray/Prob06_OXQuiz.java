package stage05_oneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class Prob06_OXQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();

        String[] quizResult = new String[testCase];

        for(int i=0; i<quizResult.length; i++){
            quizResult[i] = input.next();

            int count = 0, sum = 0;
            for(int j=0; j<quizResult[i].length(); j++){
                if(quizResult[i].charAt(j) == 'O'){
                    sum += ++count;
                }else count = 0;
            }
            quizResult[i] = String.valueOf(sum);
        }

        for(String loop : quizResult){
            System.out.println(loop);
        }
    }
}