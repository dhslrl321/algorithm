package algorithm.theory.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bfs {

    static LinkedList<Integer>[] nodes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        nodes = new LinkedList[n+1];

        for (int i = 0; i < n + 1; i++) {
            nodes[i] = new LinkedList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            nodes[n1].add(n2);
            nodes[n2].add(n1);
            Collections.sort(nodes[n1]);
            Collections.sort(nodes[n2]);
        }

        boolean[] dfsVisited = new boolean[n+1];
        boolean[] bfsVisited = new boolean[n+1];

        StringBuilder dfsAnswer = new StringBuilder();
        StringBuilder bfsAnswer = new StringBuilder();

        dfs(v, dfsVisited, dfsAnswer);
        bfs(v, bfsVisited, bfsAnswer);
        System.out.println(dfsAnswer + "\n" + bfsAnswer);
    }

    static void dfs(int node, boolean[] visited, StringBuilder answer){
        if(visited[node]) return;

        visited[node] = true;
        answer.append(node).append(" ");
        for(int adj : nodes[node]){
            dfs(adj, visited, answer);
        }
    }
    static void bfs(int node, boolean[] visited, StringBuilder answer){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(node);

        while(!queue.isEmpty()){
            node = queue.poll();
            if(visited[node]) continue;

            visited[node] = true;
            answer.append(node).append(" ");
            queue.addAll(nodes[node]);
        }


    }

}
