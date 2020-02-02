package stage05_oneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class Prob05_Average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int subjectNum = input.nextInt();

        int[] subject = new int[subjectNum];

        for (int i = 0; i < subject.length; i++) {
            subject[i] = input.nextInt();
        }

        Arrays.sort(subject);

        int maxScore = subject[subject.length - 1];


        double[] score = new double[subjectNum];

        for (int i = 0; i < subject.length; i++) {
            score[i] = (double) subject[i] / (double) maxScore * 100;
        }
        double avg = (Arrays.stream(score).sum() / subjectNum);
        System.out.println(avg);
    }
}
