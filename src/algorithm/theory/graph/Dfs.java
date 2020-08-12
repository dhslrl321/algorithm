package algorithm.theory.graph;

import java.util.*;

public class Dfs {

    private static int n;
    private static LinkedList<Integer>[] nodes;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        int m = input.nextInt();
        int v = input.nextInt();

        nodes = new LinkedList[n + 1];
        for (int i = 0; i <= n; i++) {
            nodes[i] = new LinkedList<>();
        }

        for (int i = 0; i < m; i++) {
            int n1 = input.nextInt();
            int n2 = input.nextInt();

            nodes[n1].add(n2);
            nodes[n2].add(n1);
            Collections.sort(nodes[n1]);
            Collections.sort(nodes[n2]);
        }

        StringBuilder dfsAnswer = new StringBuilder();
        StringBuilder bfsAnswer = new StringBuilder();

        boolean[] dfsState = new boolean[n + 1];
        boolean[] bfsState = new boolean[n + 1];
        dfs(v, dfsState, dfsAnswer);
        bfs(v, bfsState, bfsAnswer);
        System.out.println(dfsAnswer + "\n" + bfsAnswer);
    }

    static void dfs(int node, boolean[] visited, StringBuilder sb) {
        if(visited[node]) return ;

        visited[node] = true;
        sb.append(node).append(" ");

        for(int adj : nodes[node]){
            dfs(adj, visited, sb);
        }
    }

    static void bfs(int node, boolean[] visited, StringBuilder sb){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(node);

        while(!queue.isEmpty()){
            node = queue.poll();

            if(visited[node]) continue;

            visited[node] = true;
            sb.append(node).append(" ");

            queue.addAll(nodes[node]);
        }
    }
}


