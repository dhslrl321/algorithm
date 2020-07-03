package baekjoon.classification.class06_DFS_BFS;

import java.io.*;

public class MyDFS인접행렬 {

    static int edge; // 노드
    static int vertex; // 간선
    static int[][] ad; // 인접 행렬
    static boolean[] visit; // 방문 확인 배열

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        edge = Integer.parseInt(br.readLine());
        vertex = Integer.parseInt(br.readLine());
        ad = new int[vertex+1][vertex+1];
        visit = new boolean[vertex+1];

        for (int i = 0; i < edge; i++) { // 인접 행렬 초기화 (연결된 간선 1로)
            int t1 = Integer.parseInt(br.readLine());
            int t2 = Integer.parseInt(br.readLine());

            ad[t1][t2] = ad[t2][t1] = 1;
        }

        dfs(1); // 1번부터 탐색 시작

        bw.flush();
        bw.close();
    }

    public static void dfs(int n){
        visit[n] = true; //함수 호출시 방문 했음을 표시

        System.out.println(n + " ");

        for (int i = 0; i < vertex+1; i++) {
            if(ad[n][i] == 1 && !visit[i]){
                dfs(1);
            }
        }
    }

}
