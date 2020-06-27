package programmers.level1;

import java.util.Arrays;

public class Prob04_WorkoutCloath {
    public static void main(String[] args) {

    }

    int solution(int n, int[] lost, int[] reverse) {
        int answer = 0;

        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        /* 여벌 체육복 없는 학생 - 1 */
        for (int value : lost) {
            arr[value-1] -= 1;
        }

        /* 여벌 체육복 있는 학생 + 1 */
        for (int value : reverse) {
            arr[value-1] += 1;
        }

        for (int i = 0; i < arr.length; i++) {

            /*if(arr[i] == 2 && i == 0 && arr[i+1] == 0) {
                arr[i] -= 1;
                arr[i+1] += 1;
                continue;
            }*/
            if(arr[i] == 2 && arr[i+1] == 0){
                // 내 뒷 번호가 체육복이 없는 경우
                arr[i] -= 1;
                arr[i+1] += 1;
                continue;
            }
            if(i >= 1){
                if(arr[i] == 2 && arr[i-1] == 0) {
                    // 내 앞 번호가 체육복이 없는 경
                    arr[i] -= 1;
                    arr[i-1] += 1;
                }
            }
        }

        return answer;
    }
}
