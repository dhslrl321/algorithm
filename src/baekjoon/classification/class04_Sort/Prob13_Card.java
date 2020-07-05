package baekjoon.classification.class04_Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prob13_Card {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        Integer[] intArr = new Integer[n];
        for(int i = 0; i < n; i++){
            intArr[i] = input.nextInt();
        }

        Arrays.sort(intArr, Collections.reverseOrder());

        Long[] longArrPos = new Long[intArr[0] + 1];
        Long[] longArrNeg = new Long[intArr[0] + 1];

        for(Integer iter : intArr){
            if(iter >= 0) longArrPos[iter]++;
            else longArrNeg[-iter]++;
        }
        Arrays.sort(longArrPos, Collections.reverseOrder());
        Arrays.sort(longArrNeg, Collections.reverseOrder());

        if(longArrPos[0] > longArrNeg[0]){
            System.out.println();
        }
    }
}
