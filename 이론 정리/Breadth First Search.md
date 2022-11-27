# Breadth First Search, BFS

- 설명
    - 그래프의 모든 정점을 탐색하는 방법 중, 자식 노드를 순차적으로 하나씩 탐색하는 방법
    - 루트의 모든 자식 노드를 방문하고 다음으로 루트에서 간선으로 연결된 다른 노드를 거리 순으로 방문

# 구현

- 큐를 이용한 구현

# 장단점

- 장점
  - 출발 노드에서 목표 노드까지 최단 거리를 보장
- 단점
  - 경로가 매우 길 경우에는 탐색 가지가 급격히 증가하므로 보다 많은 메모리가 필요

```java
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
```

# see also

- depth first search
- 