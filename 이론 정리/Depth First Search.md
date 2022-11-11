# Depth First Search, DFS

- 설명
  - 그래프의 모든 정점을 탐색하는 방법 중, 깊은 부분을 우선적으로 탐색하는 방법
  - 루트의 자식 정점을 하나 방문한 다음 아래로 내려갈 수 있는 곳 까지 내려간다
    - 내려갈 곳이 없으면 되돌아오며, 되돌아오는 도중에 내려갈 곳이 있다면 내려간다

# 구현

- 구현법은 2가지가 존재
  1. 직접적인 stack 사용 (자바 collections Stack 클래스 이용)
  2. 간접적인 stack 사용 (재귀 함수)

### 직접적인 Stack 사용

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
```

### 간접적 Stack 사용 (재귀함수)

```java
public class DfsWithRecursive {
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
        dfs(1);
    }

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
}
```