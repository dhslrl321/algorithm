# Breadth First Search, BFS

- 설명
    - 그래프의 모든 정점을 탐색하는 방법 중, 자식 노드를 순차적으로 하나씩 탐색하는 방법
    - 루트의 모든 자식 노드를 방문하고 다음으로 루트에서 간선으로 연결된 다른 노드를 거리 순으로 방문

# 구현

- 큐를 이용한 구현

```java
public class Main {
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
        bfs();
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visit(1);

        while (!queue.isEmpty()) {
            int firstNode = queue.remove();

            List<Integer> linkedNodes = doubleLinkedListGraph.get(firstNode);
            for (int linkedNode : linkedNodes) {
                if (!visited[linkedNode]) {
                    queue.add(linkedNode);
                    visit(linkedNode);
                }
            }
        }
    }

    private static void visit(int n) {
        System.out.printf("%d node visited!%n", n);
        visited[n] = true;
    }
}
```