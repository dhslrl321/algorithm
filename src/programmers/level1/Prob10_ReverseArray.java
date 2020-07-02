package programmers.level1;

import java.util.Arrays;

public class Prob10_ReverseArray {
    public static void main(String[] args) {
        long a = 12345;
        System.out.println(Arrays.toString(solution(a)));

    }

    private static int[] solution(long n) {
        String str = String.valueOf(n);
        String[] arr = str.split("");
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            int index = Math.abs(i - (arr.length-1));
            answer[index] = Integer.parseInt(arr[i]);
        }

        return answer;
    }
}
