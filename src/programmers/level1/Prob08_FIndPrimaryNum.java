package programmers.level1;

import java.util.Arrays;

public class Prob08_FIndPrimaryNum {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(solution(n));

    }

    private static int solution(int n){
        boolean[] arr = new boolean[n + 1];
        int answer = 0;

        for (int i = 2; i < arr.length; i++) {
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                if(i == 2 || i == 3 || i ==5) arr[i] = false;
                else {
                    arr[i] = true;
                }
            }
        }
        for(boolean iter : arr) {
            if(!iter) answer++;
        }
        return answer - 2;
    }
}
