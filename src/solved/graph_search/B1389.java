package solved.graph_search;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B1389 {

    private static List<List<Integer>> graph = new ArrayList<>();
    private static boolean[] visited;
    private static int[] depth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");
            int from = Integer.parseInt(s[0]);
            int to = Integer.parseInt(s[1]);

            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        int min = Integer.MAX_VALUE;
        int index = 0;

        for(int i = 1; i <= n; i++) {
            depth = new int[n + 1];
            visited = new boolean[n + 1];
            int kevinBaconNumber = getKevinBaconNumber(i);
            if(min > kevinBaconNumber) {
                min = kevinBaconNumber;
                index = i;
            }
        }

        bw.write(String.valueOf(index));

        bw.flush();
        bw.close();
    }

    private static int getKevinBaconNumber(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        visited[start] = true;

        int sum = 0;

        while(!queue.isEmpty()) {
            int front = queue.remove();
            for(int value : graph.get(front)) {
                if(!visited[value]) {
                    visited[value] = true;
                    depth[value] = depth[front] + 1;
                    queue.add(value);
                }
            }
        }

        for (int i = 1; i < depth.length; i++) {
            sum += depth[i];
        }

        return sum;
    }
}
