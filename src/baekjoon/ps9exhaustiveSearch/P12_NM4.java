package baekjoon.ps9exhaustiveSearch;

import java.io.*;
import java.util.StringTokenizer;

public class P12_NM4 {
    static int[] arr = new int[9];
    static int n, m;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dfs(0, 1);
        bw.flush();
        bw.close();
    }

    private static void dfs(int index, int before) throws IOException{
        if(index == m) {
            for (int i = 0; i < m; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = before; i <= n; i++) {
            arr[index] = i;
            dfs(index + 1, arr[index]);
        }
    }
}
