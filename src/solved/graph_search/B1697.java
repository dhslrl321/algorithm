package solved.graph_search;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class B1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nk = br.readLine().split(" ");

        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] visited = new int[100_001];

        for (int i = 1; i < 100_001; i++) {
            graph.add(new ArrayList<>());
        }

        Queue<Integer> queue = new LinkedList<>();

        visited[n] = 0;
        queue.add(n);

        while(!queue.isEmpty()) {
            int front = queue.remove();

            if(front == k) {
                System.out.println(visited[front]);
                break;
            }

            int[] next = {front + 1, front - 1, front * 2};

            for (int i = 0; i < next.length; i++) {
                if(0 <= next[i] && next[i] <= 100_000) {
                    if(visited[next[i]] == 0) {
                        visited[next[i]] = visited[front] + 1;
                        queue.add(next[i]);
                    }
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
