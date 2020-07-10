package programmers.level1;

import java.util.Arrays;

public class Prob12_TreasureMap {
    public static void main(String[] args) {
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i=0; i<n; i++) {
            String temp = Integer.toBinaryString(arr1[i] | arr2[i]);
            temp = String.format("%5s", temp);
            answer[i] = temp.replaceAll("1", "#").replaceAll("0", " ");
        }


        return answer;
    }
}
/*
* ######", "###  #", "##  ##", " #### ", " #####", "### # "
* */