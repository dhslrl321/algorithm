package solved.impl;

import java.io.*;

/**
 * Keep
 * 변수와 메서드를 의미있는 이름으로 나누었다.
 * util 성 함수를 짧게 잘 가져갔다.
 *
 * Problem
 * 논리는 쉽게 꺼낼 수 있었는데 문제는 배열 index 에 고민을 전혀 해보지 않았다.
 * 입력은 non-index 로 받고 있는데 배열에서는 index 로 처리하기 때문에 이 둘 간의 차이를 고려하지 않았다.
 * 또 문제를 쉽게 풀어갈 수 있었는데 어렵게 풀어갔다
 *  - 쉽게란?
 *  - 나는 start 랑 end 를 기록해두고 한 번에 toggle 하려고 했다
 *  - 다른 풀이로는 start, end 가 값이 바뀔때 마다 toggle 해주는 풀이가 있다.
 * 디버깅을 내 스스로 하지 않았다. (한 30%는 내가 한듯, 반례를 아예 생각해보지 않음)
 * 문제를 안 읽었다. (끝까지 읽자)
 *
 * Try
 * 다음에도 의미 있는 이름의 메서드로 나누자
 * 배열을 static 으로 빼는 것도 고려할만 하다
 */
public class B1244 {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");

        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }

        int loop = Integer.parseInt(br.readLine());

        while (loop-- > 0) {
            String[] genderAndNumber = br.readLine().split(" ");
            int gender = Integer.parseInt(genderAndNumber[0]);
            int number = Integer.parseInt(genderAndNumber[1]) - 1;

            if (gender == 1) {
                male(number);
            } else {
                female(number);
            }
        }

        for (int i = 1; i <= arr.length; i++) {
            bw.write(arr[i - 1] + " ");
            if (i % 20 == 0) {
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }

    private static void male(int number) {
        number += 1;
        for (int i = number; i <= arr.length; i++) {
            if (i % number == 0) {
                toggleArrayValueByIndex(i-1);
            }
        }
    }

    private static void female(int number) {
        toggleArrayValueByIndex(number);

        int start = number - 1;
        int end = number + 1;

        while (validateArrayIndex(start, end) && arr[start] == arr[end]) {
            toggleArrayValueByIndex(start);
            toggleArrayValueByIndex(end);
            start--;
            end++;
        }
    }

    private static boolean validateArrayIndex(int index1, int index2) {
        return index1 >= 0 && (arr.length - 1) >= index2;
    }

    private static void toggleArrayValueByIndex(int index) {
        arr[index] = (arr[index] == 0) ? 1 : 0;
    }
}
