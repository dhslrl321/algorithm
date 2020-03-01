package algorithm.class06_DFS_BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prob01_DFSBFS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vertex = input.nextInt(); // 정점점의 수 N
        int edge = input.nextInt(); // 간선의 수 m
        int start = input.nextInt(); // 시작 정점의 번호

        boolean[] visited = new boolean[vertex+1]; // 방분 flag

        ArrayList<Integer>[] adjList = new ArrayList[vertex+1]; // 인접 리스트
        // adjacency list init
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<Integer>();
        }

        // 연결리스트에 각 노드 추가
        for (int i = 0; i < edge; i++) {
            int a1 = input.nextInt();
            int a2 = input.nextInt():

            adjList[a1].add(a2);
            adjList[a2].add(a1);
        }

        // 자식 노드가 여러개면 작은 번호의 노드부터 방문하기 위해 오름차순 정렬
        for (int i = 0; i < adjList.length; i++) {
            Collections.sort(adjList[i]);
        }
    }

    private static void dfs(ArrayList<Integer>[] adjList, boolean[] visited, int v){
        visited[v] = true;
        System.out.print(v + " ");
        for(int e : adjList[v]){
            if(!visited[e]) dfs(adjList, visited, e);
        }
    }
}
