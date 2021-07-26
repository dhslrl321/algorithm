package solved.graph_search;

import java.io.*;
import java.util.*;

public class B1260 {

    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nmv = br.readLine().split(" ");

        int n = Integer.parseInt(nmv[0]);
        int m = Integer.parseInt(nmv[1]);
        int v = Integer.parseInt(nmv[2]);

        // 인접 리스트 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 그래프 연결
        while(m-- > 0) {
            String[] edges = br.readLine().split(" ");

            int from = Integer.parseInt(edges[0]);
            int to = Integer.parseInt(edges[1]);

            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        // 순서대로 탐색을 위한 정렬
        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        // 방문 체크 배열 생성 및 dfs 호출
        visited = new boolean[n + 1];
        dfs(v);

        // 방문 체크 배열 초기화 및 bfs 호출
        visited = new boolean[n + 1];
        bfs(v);
    }

    private static void dfs(int v) {

        Stack<Integer> stack = new Stack<>(); // 깊이 우선 탐색을 위한 자료구조

        boolean flag; // 스택 최상단 노드와 인접한 노드가 존재하지 않는 경우를 위한 flag

        System.out.print(v + " "); // 가장 처음 존재하는 노드는 바로 방문하므로 출력
        visited[v] = true; // 가장 처음 존재하는 노드는 바로 방문하므로 방문 처리

        stack.push(v); // 탐색을 위한 초기 노드의 번호 추가

        while(!stack.isEmpty()) { // 스택이 비어있지 않을 때 까지
            int top = stack.peek();

            flag = false; // 스택 최상단 노드와 인접한 노드가 존재하지 않는 경우

            for (int value : graph.get(top)) { // 스택 최상단 노드의 인접 노드가 존재할 때 까지 반복
                if(!visited[value]) { // 방문하지 않았던 노드만
                    stack.push(value); // 인접한 노드를 스택에 추가
                    System.out.print(value + " "); // 방문 출력
                    visited[value] = true; // 방문 처리
                    flag = true; // 최상단 노드가 인접한 경우 pop 하지 않게 하기 위한 flag

                    break; // 스택에 추가했으면 바로 반복을 종료시키고 스택의 최상단 노드부터 다시 시작
                }
            }

            if(!flag) { // 스택 최상단 노드와 인접한 노드가 존재하지 않는 경우
                stack.pop(); // 스택에서 빼기
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>(); // 넓이 우선 탐색을 위한 자료구조

        queue.add(v); // 탐색을 위한 초기 노드를 queue 에 삽입
        System.out.print("\n" + v + " "); // 최초 노드를 출력
        visited[v] = true; // 최초 노드를 방문 처리

        while(!queue.isEmpty()) { // 큐가 비어있지 않을 때 까지
            int front = queue.remove(); // 큐의 가장 앞 노드를 꺼냄
            for(int value : graph.get(front)) { // 큐에서 꺼낸 노드와 인접한 노드 모두를 큐에 삽입
                if(!visited[value]) { // 방문하지 않았던 노드만
                    queue.add(value); // 큐에 삽입하고
                    System.out.print(value + " "); // 출력한 뒤
                    visited[value] = true; // 방문 처리
                }
            }
        }
    }
}
