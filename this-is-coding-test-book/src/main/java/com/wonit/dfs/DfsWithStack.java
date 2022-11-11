package com.wonit.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DfsWithStack {
    private static final List<List<Integer>> doubleLinkedListGraph = new ArrayList<>();
    private static boolean[] visited;

    public static void main(String[] args) {
        int[][] graphRaw = {
                {},             // node 0 <- 일부러 비워둠 (아래 int 값이 노드 번호이므로 인덱스면 안됨)
                {2, 3, 8},      // node 1
                {1, 7},         // node 2
                {1, 4, 5},      // node 3
                {3, 5},         // node 4
                {3, 4},         // node 5
                {7},            // node 6
                {2, 6, 8},      // node 7
                {1, 7}          // node 8
        };

        // 1-1. 이중 연결 리스트로 구현된 그래프 초기화
        for (int i = 0; i < graphRaw.length; i++) {
            doubleLinkedListGraph.add(new ArrayList<>());
        }
        // 1-2. 방문 여부 배열 초기화
        visited = new boolean[graphRaw.length];

        // 2. 그래프 input 값을 이중 연결 리스트로 변환
        for (int i = 0; i < graphRaw.length; i++) {
            List<Integer> node = doubleLinkedListGraph.get(i);
            for (int linkedNode : graphRaw[i]) {
                node.add(linkedNode);
            }
        }

        // 3. dfs 시작;
        dfs();
    }

    private static void dfs() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);

        while(!stack.empty()) {
            Integer poppedNode = stack.pop();

            if (!visited[poppedNode]) {
                visit(poppedNode);

                for (Integer node : doubleLinkedListGraph.get(poppedNode)) {
                    if (!visited[node]) {
                        stack.add(node);
                    }
                }
            }
        }
    }

    private static void visit(int n) {
        System.out.printf("%d node visited!%n", n);
        visited[n] = true;
    }
}
