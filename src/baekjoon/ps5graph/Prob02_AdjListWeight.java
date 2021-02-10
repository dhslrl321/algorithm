package baekjoon.ps5graph;


import java.util.ArrayList;
import java.util.Scanner;

class Edge<W, V> {
    private W weight;
    private V v;

    public void setEdge(W weight, V v) {
        this.weight = weight;
        this.v = v;
    }
}

public class Prob02_AdjListWeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 4; // 노드의 갯수
        int m = 5; // 간선의 갯수

        ArrayList<Edge<Integer, Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new Edge<>());
        }

        for (int i = 0; i < m; i++) { // 간선의 갯수만큼 반복
            int n1 = input.nextInt(); // 노드 1
            int n2 = input.nextInt(); // 노드 2

            int weight = input.nextInt();

            graph.get(n1).setEdge(n2, weight);
            graph.get(n2).setEdge(n1, weight);
        }
    }
}
