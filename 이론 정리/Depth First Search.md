# Depth First Search, DFS

- 설명
  - 그래프의 모든 정점을 탐색하는 방법 중, 깊은 부분을 우선적으로 탐색하는 방법
  - 루트의 자식 정점을 하나 방문한 다음 아래로 내려갈 수 있는 곳 까지 내려간다
    - 내려갈 곳이 없으면 되돌아오며, 되돌아오는 도중에 내려갈 곳이 있다면 내려간다

# 구현

- 구현법은 2가지가 존재
  1. 직접적인 stack 사용 (자바 collections Stack 클래스 이용하는 방법)
  2. 간접적인 stack 사용 (method call stack 을 이용하는 방법)

# 장단점

- 장점
  - 단지 현 경로상의 노드만 기억하면 되므로 저장공간의 수요가 비교적 적다
  - 목표 노드가 깊은 단계에 있을 때 해를 빨리 구할 수 있음
- 단점
  - 얻어진 해가 최단 경로가 된다는 보장이 없다. 
    - 이는 목표에 이르는 경로가 다수인 문제에 대해 dfs 는 해에 다다르면 탐색을 끝내버리므로, 이때 얻어진 해는 최적이 아닐 수 있다는 의미이다.
  - 해를 구할 수 없는 경우 경로에 깊이 빠질 수 있다
    - 미리 지정한 임의의 depth 가 넘어가면 탐색을 종료하도록 해야한다

### 직접적인 Stack 사용

```java
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
```

### 간접적 Stack 사용 (재귀함수)

```java
private static void dfs(int startNode) {
    visit(startNode);

    List<Integer> linkedNode = doubleLinkedListGraph.get(startNode);
    for (Integer integer : linkedNode) {
        if (!visited[integer]) {
            dfs(integer);
        }
    }
}

private static void visit(int n) {
    System.out.printf("%d node visited!%n", n);
    visited[n] = true;
}
```