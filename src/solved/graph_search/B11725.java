package solved.graph_search;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class B11725 {

    private static List<List<Integer>> tree = new ArrayList<>();
    private static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        parent = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        while(n-- > 1) {
            String[] s = br.readLine().split(" ");
            int from = Integer.parseInt(s[0]);
            int to = Integer.parseInt(s[1]);

            tree.get(from).add(to); // 왜 단방향이 아닐까?
            tree.get(to).add(from);
        }

        dfs(1);

        for (int i = 2; i < parent.length; i++) {
            bw.write(parent[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void dfs(int start) {
        for(int value : tree.get(start)) {
            if(parent[value] == 0) {
                parent[value] = start;
                dfs(value);
            }
        }
    }
}
