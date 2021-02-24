package baekjoon.ps9exhaustiveSearch;

import java.io.*;

public class P11_NM3 {

    static int[] arr; // 1 ~ m 까지 고른 수열 배열
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        arr = new int[m];
        dfs(0, n, m);
        bw.flush();
        bw.close();
    }

    private static void dfs(int index, int n, int m) throws IOException{
        if(index == m) {
            for (int i = 0; i < m; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return; // m 자리까지 다 채웠으면 빠져 나가는 기저사례
        }

        for (int i = 1; i <= n; i++) {
            arr[index] = i;
            dfs(index + 1, n, m);
        }
    }
}
