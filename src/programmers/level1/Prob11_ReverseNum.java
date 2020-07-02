package programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Prob11_ReverseNum {
    public static void main(String[] args) {
        String[] a = {"3", "2", "1", "9", "5", "4"};
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
    private int[] solution(int[] arr) {
        int[] answer;
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            Math.min(min, arr[i]);
        }
        answer = new int[arr.length-1];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min) continue;
            answer[index++] = arr[i];
        }

        return answer;
    }
}
