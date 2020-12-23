package baekjoon.Extra;

import java.util.*;

public class Prob02_DfsBfs {

    static ArrayList<Integer>[] adj;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int start = input.nextInt();

        adj = new ArrayList[n + 1];

        for (int i = 0; i <= n ; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int v1 = input.nextInt();
            int v2 = input.nextInt();

            adj[v1].add(v2); adj[v2].add(v1);
        }
        for (int i=1; i<=n; i++) {
            Collections.sort(adj[i]);
        }
        check = new boolean[n + 1];
        dfs(start);
        sb.append("\n");
        check = new boolean[n + 1];
        bfs(start);
        System.out.println(sb.toString());
    }

    public static void dfs(int x) {
        if(check[x]) return;
        check[x] = true;
        sb.append(x).append(" ");
        for(int y : adj[x]){
            if(!check[y]) dfs(y);
        }
    }
    public static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();

        check[start] = true;

        queue.add(start);

        while(!queue.isEmpty()) {
            int x = queue.remove();
            sb.append(x).append(" ");
            for(int y : adj[x]) {
                if(!check[y]) {
                    check[y] = true;
                    queue.add(y);
                }
            }
        }
    }
}
