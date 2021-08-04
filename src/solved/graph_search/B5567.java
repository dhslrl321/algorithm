package solved.graph_search;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B5567 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        List<List<Integer>> graph = new ArrayList<>();

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

        int[] depth = new int[n + 1];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        depth[1] = 1;

        while(!queue.isEmpty()) {
            int front = queue.remove();

            for(int value : graph.get(front)) {
                if(depth[value] == 0) {
                    depth[value] = depth[front] + 1;
                    queue.add(value);
                }
            }
        }

        int count = 0;

        for (int i = 2; i < depth.length; i++) {
            if(depth[i] == 2 || depth[i] == 3) {
                count++;
            }
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
    }
}
