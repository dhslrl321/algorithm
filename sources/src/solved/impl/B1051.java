package solved.impl;

import java.io.*;
import java.util.*;

public class B1051 {

  private static int n;
  private static int m;
  private static int[][] arr;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] nm = br.readLine().split(" ");

    n = Integer.parseInt(nm[0]);
    m = Integer.parseInt(nm[1]);

    arr = new int[n][m];

    for (int i = 0; i < n; i++) {
      String[] input = br.readLine().split("");
      for (int j = 0; j < input.length; j++) {
        arr[i][j] = Integer.parseInt(input[j]);
      }
    }
    System.out.println(getAnswer());
  }

  private static int getAnswer() {
    // 최대 길이 반환
    int maximum = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < arr.length; j++) {
        int candidate = getMaximumSizeByIndex(j, i);
        maximum = Math.max(maximum, candidate);
      }
    }

    return maximum;
  }

  // 기준 인덱스에서 시작해서 최대 찾기
  private static int getMaximumSizeByIndex(int x, int y) {
    int plus = 1;
    int max = 0;
    while (isValidCoordinates(x + plus, y + plus)) {

      Pair a = new Pair(x, y);
      Pair b = new Pair(x + plus, y);
      Pair c = new Pair(x, y + plus);
      Pair d = new Pair(x + plus, y + plus);

      if (isSquare(a, b, c, d)) {
        max = Math.max((plus + 1) * (plus + 1), max);
      }

      plus++;
    }

    return max;
  }

  private static boolean isSquare(Pair a, Pair b, Pair c, Pair d) {
    boolean ab = arr[a.y][a.x] == arr[b.y][b.x];
    boolean cd = arr[c.y][c.x] == arr[d.y][d.x];
    boolean bd = arr[b.y][b.x] == arr[d.y][d.x];

    return ab && cd && bd;
  }

  private static boolean isValidCoordinates(int x, int y) {
    return 0 <= x && x < m && 0 <= y && y < n;
  }

  static class Pair {
    int x;
    int y;

    Pair (int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}