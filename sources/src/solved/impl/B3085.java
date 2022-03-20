package solved.impl;

import java.io.*;
import java.util.*;

/**
 * Keep
 * - 기억이 안 나는데
 * - 문제를 잘게 쪼개서 함수 인텉페이스를 먼저 만들면서 나아가는 접근 좋았다.
 * - 이렇게 하니까 하나씩 확실하게 동작한다는 보장만 있으면 그거에만 집중하면 된다.
 *
 * Problem
 * - 인덱스가 헷갈렸다
 * - x 우선 탐색은 자주 해봤으니까 잘 되는데 y 우선 탐색은 잘 안된다.
 *
 * Try
 * - 뭘 시도해볼까.
 * - Edge Case 에 대해서 생걱을 늘늘늘 해보자
 * - 가능하면 함수 하나당 엣지 케이스를 하나씩 둬보자
 */
public class B3085 {

    private static int n;
    private static String[][] arr;

    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new String[n][n];
        int answer = 1;

        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split("");
            for (int j = 0; j < row.length; j++) {
                arr[i][j] = row[j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                for (int k = 0; k < 4; k++) {
                    swapDelta(i, j, k); // swap
                    answer = Math.max(answer, getMaximumLength());
                    swapDelta(i, j, k); // revert
                }
            }
        }

        System.out.println(answer);
    }

    private static void swapDelta(int x, int y, int deltaIndex) {
        String temp = arr[y][x]; // 기존의 (y, x) 의 값
        int newX = dx[deltaIndex] + x; // delta 를 합한 newX
        int newY = dy[deltaIndex] + y; // delta 를 합한 newY

        if (isValidIndex(newX, newY)) {
            arr[y][x] = arr[newY][newX]; // 기존의 (y, x) 에 swap 할 값 넣기
            arr[newY][newX] = temp; // swap 에 기존의 (y, x) 넣기
        }
    }

    private static int getMaximumLength() {
        int max = 0;

        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (j == 0) { // count 초기화
                    count = 1;
                }

                if (isValidIndex(j - 1, i)) {
                    if (arr[i][j].equals(arr[i][j - 1])) {
                        count++;
                        max = Math.max(count, max);
                    } else {
                        count = 1;
                    }
                }
            }
        }

        int yCount = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (j == 0) { // count 초기화
                    yCount = 1;
                }

                if (isValidIndex(i, j - 1)) {
                    if (arr[j][i].equals(arr[j-1][i])) {
                        yCount++;
                        max = Math.max(yCount, max);
                    } else {
                        yCount = 1;
                    }
                }
            }
        }
        return max;
    }

    private static boolean isValidIndex(int x, int y) { // 인덱스들이 배열에 유효한지 검사
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}
