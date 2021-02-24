package baekjoon.ps5graph;

import java.util.ArrayList;

public class P01_AdjList {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        int[] edge1 = {1, 2};
        int[] edge2 = {1, 3};
        int[] edge3 = {1, 4};
        int[] edge4 = {2, 3};
        int[] edge5 = {3, 4};

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // 그래프 초기화
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(edge1[0]).add(edge1[1]);
        graph.get(edge1[1]).add(edge1[0]);

        graph.get(edge2[0]).add(edge2[1]);
        graph.get(edge2[1]).add(edge2[0]);

        graph.get(edge3[0]).add(edge3[1]);
        graph.get(edge3[1]).add(edge3[0]);

        graph.get(edge4[0]).add(edge4[1]);
        graph.get(edge4[1]).add(edge4[0]);

        graph.get(edge5[0]).add(edge5[1]);
        graph.get(edge5[1]).add(edge5[0]);
    }
}
