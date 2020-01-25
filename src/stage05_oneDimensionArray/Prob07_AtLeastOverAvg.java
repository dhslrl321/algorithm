package stage05_oneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class Prob07_AtLeastOverAvg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();
        int[] students = new int[testCase];
        double[] ans = new double[testCase];
        for(int i=0; i<students.length; i++){

            double scoreSum = 0, scoreAvg = 0;
            double rateSum = 0, rateAvg = 0;
            int num = 0;
            students[i] = input.nextInt();
            int[] score = new int[students[i]];
            for(int j=0; j<students[i]; j++){
                score[j] = input.nextInt();
                num = students[i];
                scoreSum += score[j];
            }
            scoreAvg = scoreSum / num;
            for(int k=0; k<score.length; k++){
                if(score[k] > scoreAvg){
                    rateSum++;
                }
                rateAvg = rateSum / num;
                ans[i] = rateAvg;
            }
        }

        for(int i=0; i<ans.length; i++){
            System.out.printf("%.3f%% \n", ans[i] * 100);

        }

    }
}
