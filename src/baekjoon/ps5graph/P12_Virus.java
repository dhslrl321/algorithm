package baekjoon.ps5graph;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class P12_Virus {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int v = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        while(v-- > 0) {
            String[] n1n2 = br.readLine().split(" ");
            graph.get(Integer.parseInt(n1n2[0])).add(Integer.parseInt(n1n2[1]));
            graph.get(Integer.parseInt(n1n2[1])).add(Integer.parseInt(n1n2[0]));
        }

        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        visited[1] = true;
        while(!queue.isEmpty()) {
            int x = queue.remove();
            for(int value : graph.get(x)) {
                if(!visited[value]) {
                    queue.add(value);
                    visited[value] = true;
                    answer++;
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
