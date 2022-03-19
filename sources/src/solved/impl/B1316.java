package solved.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Keep
 * - 단계별로 나누고 집중하는거 좋았어
 *  - 입력 받는 단계,
 *  - 종료 조건 찾는 단계
 *  - PoC 단계
 * - 바로 전에 try 한다는거 진짜 시도했어
 *
 * Problem
 * - Edge Case 에 대해서 고민을 전혀 안했던거 같아
 * - PoC 하다가 갑자기 다른 길로 새서 깃헙 readme 정리했어
 *
 * Try
 *
 */
public class B1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int answer = 0;

        for (int i = 0; i < n; i ++) {
            String word = br.readLine();

            if (checkGroupLetter(word)) {
                answer++;
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }

    private static boolean checkGroupLetter(String word) {
        boolean[] check = new boolean[26];
        char[] letters = word.toCharArray(); // 문자 배열로 바꾸기

        int zeroIndex = letters[0] - 'a';
        check[zeroIndex] = true;

        for (int i = 1; i < letters.length; i++) {
            int index = letters[i] - 'a'; // 알파벳 인덱스
            
            // 이전 단어랑 같으면 무조건 건너 띄어
            if (letters[i-1] == letters[i]) continue;

            // 이전 단어랑 다른데 만약 체크가 된 이력이 있어?
            if (check[index]) {
                return false; // 그룹 단어가 아니야
            }
            check[index] = true; // 체크해
        }

        // 마지막까지 왔는데도 그룹 단어가 없었으면 얘는 그룹 단어야
        return true;
    }
}
