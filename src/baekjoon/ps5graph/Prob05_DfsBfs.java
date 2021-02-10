package baekjoon.ps5graph;

import java.io.*;
import java.util.*;

public class Prob05_DfsBfs {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nmv = br.readLine().split(" ");

        int n = Integer.parseInt(nmv[0]);
        int m = Integer.parseInt(nmv[1]);
        int v = Integer.parseInt(nmv[2]);

        // 방문 체크 배열 생성

        // 인접 리스트 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 입력 처리 (그래프 연결)
        for(int i = 0; i < m; i++) {
            String[] n1n2 = br.readLine().split(" ");
            int n1 = Integer.parseInt(n1n2[0]);
            int n2 = Integer.parseInt(n1n2[1]);

            graph.get(n1).add(n2);
            graph.get(n2).add(n1);
        }
        for (int i = 0; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        visited = new boolean[n + 1];
        dfsByRecursive(v);
        bw.flush();
        sb.append("\n");
        visited = new boolean[n + 1];
        bfs(v);
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfsByStack(int x) {
        Stack<Integer> stack = new Stack<>();
        boolean flag;
        visited[x] = true;
        sb.append(x).append(" ");
        stack.push(x);
        while(!stack.isEmpty()) {
            x = stack.peek();
            int size = graph.get(x).size();
            flag = false;
            for (int i = 0; i < size; i++) {
                int value = graph.get(x).get(i);
                if (!visited[value]) {
                    stack.push(value);
                    sb.append(value).append(" ");
                    visited[value] = true;
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                stack.pop();
            }
        }
    }
    private static void dfsByRecursiveShort(int x) {
        if(visited[x])  return ;
        visited[x] = true;
        sb.append(x).append(" ");
        for(int value : graph.get(x)) {
            if (visited[value]) {
                dfsByRecursive(value);
            }
        }
    }

    private static void dfsByRecursive(int x) {
        if(visited[x]) return;
        visited[x] = true;

        sb.append(x).append(" ");

        int size = graph.get(x).size();

        for (int i = 0; i < size; i++) {
            int value = graph.get(x).get(i);
            if(!visited[value]) {
                dfsByRecursive(value);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {
            int x = queue.remove();
            sb.append(x).append(" ");
            for (int i = 0; i < graph.get(x).size(); i++) {
                int value = graph.get(x).get(i);
                if(!visited[value]) {
                    visited[value] = true;
                    queue.add(value);
                }
            }
        }
    }
}