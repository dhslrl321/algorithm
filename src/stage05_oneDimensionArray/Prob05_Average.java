package stage05_oneDimensionArray;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prob05_Average {
    public static void main(String[] args) {
        /*
        *  M = maximum number he scored
        *  Others = M * 100;
        *
        *  original avg = scoreSum / subject
        *
        *  this avg = scoreSum / subject
        *
        *  this score = score / max * 100
        *
        *  1. find maximum number
        *
        *  2. 과목의 갯수 N
        * */
        int subjectNum = 0;

        Scanner input =new Scanner(System.in);

        subjectNum = input.nextInt();

        int[] subject = new int[subjectNum];

        for(int i=0; i<subject.length; i++){
            subject[i] = input.nextInt();
        }
        System.out.println("Unaligned subject[] : " + Arrays.toString(subject));
        Arrays.sort(subject);
        System.out.println("aligned subject[] : " + Arrays.toString(subject));

        int max = subject[subject.length-1];
        System.out.println("max : " + max);
        int[] score = new int[subjectNum];

        // issue
        for(int i=0; i<subject.length; i++){
            score[i] = subject[i] / max * 100;
        }

        System.out.println("score[] : " + Arrays.toString(score));
        int avg = Arrays.stream(score).sum() / subjectNum;

        System.out.println(avg);
    }
}
