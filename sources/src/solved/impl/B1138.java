package solved.impl;

import java.io.*;

/**
 * Keep
 * - TC 를 만족시키며 손코딩으로 pseudo code 를 작성한 것 칭찬한다.
 * - 지난 문제에서 특정 조건을 나열하고 하나씩 해결해 나가는 방식을 다시 한번 썼다는 것을 칭찬한다
 * - 문제를 특정 개발 상황에서 '서사로 풀어가기' 를 했던 것에 칭찬한다
 *
 * Problem
 * - 약간 급한 면이 있었다.
 *   - 처음에는 전반적인 흐름에 대해서 잘 생각했고 잘 적었다. 하지만 코드로 짜는 순간 조건 하나를 빼먹었다.
 * - 더 좋은 방법에 대해서 짧게 고민한 것
 *   - 처음 방식대로 하면 코드가 더 더러워졌을 것으로 예상, 하지만 다시 한 번 생각하니 좀 더 깨끗한 코드가 나옴
 *
 * Try
 */
public class B1138 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");

        int[] arr = new int[n];

        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }

        int[] answer = solution(n, arr);

        for (int value : answer) {
            bw.write(value + " ");
        }

        bw.flush();
        bw.close();
    }

    private static int[] solution(int n, int[] arr) {
        int[] answers = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int jump = arr[i];

            for (int j = 0; j < arr.length; j++) {
                if (answers[j] == 0) {
                    if (jump == 0) {
                        answers[j] = i + 1;
                    }
                    jump--;
                }
            }
        }

        return answers;
    }
}
