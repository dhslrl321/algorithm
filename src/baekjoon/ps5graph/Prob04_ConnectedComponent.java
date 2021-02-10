package baekjoon.ps5graph;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Prob04_ConnectedComponent {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        visited = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        while (m-- > 0) {
            String[] uv = br.readLine().split(" ");
            int u = Integer.parseInt(uv[0]);
            int v = Integer.parseInt(uv[1]);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (dfs(i)) {
                answer += 1;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static boolean dfs(int x) {
        if(visited[x])  return false;
        visited[x] = true;
        for(int value : graph.get(x)) {
            if (visited[value]) {
                dfs(value);
            }
        }
        return true;
    }

    private static boolean bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();

        if(visited[x]) return false;
        queue.add(x);
        visited[x] = true;

        while(!queue.isEmpty()) {
            x = queue.remove();
            for(int value : graph.get(x)) {
                if(!visited[value]) {
                    queue.add(value);
                    visited[value] = true;
                }
            }
        }
        return true;
    }
}
