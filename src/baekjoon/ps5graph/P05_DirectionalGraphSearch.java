package baekjoon.ps5graph;

import java.io.*;
import java.util.ArrayList;

public class P05_DirectionalGraphSearch {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            visited = new boolean[n + 1];
            graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            String[] seq = br.readLine().split(" ");

            for (int i = 1; i <= n; i++) {
                int number = Integer.parseInt(seq[i-1]);
                graph.get(i).add(number);
            }
            int answer = 0;
            for (int i = 1; i <= n; i++) {
                if(dfs(i)) answer++;
            }
            bw.write(answer + "\n");
            bw.flush();
        }
        bw.close();
    }

    private static boolean dfs(int x) {
        if(visited[x]) return false;
        visited[x] = true;
        for(int value: graph.get(x)) {
            if (!visited[value]) dfs(value);
        }
        return true;
    }
}
