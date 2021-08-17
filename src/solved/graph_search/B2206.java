package solved.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class B2206 {

    private static int[] xPos = {1, -1, 0, 0};
    private static int[] yPos = {0, 0, 1, -1};

    private static int n;
    private static int m;
    private static int[][] visited; // 방문 여부 + 벽을 부순 횟수
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        arr = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
                visited[i][j] = Integer.MAX_VALUE;// 방문 배열을 21억으로 초기화
            }
        }


        bw.write(String.valueOf(bfs()));

        bw.flush();
        bw.close();
    }

    private static int bfs() {
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(0, 0, 1, 0));
        visited[0][0] = 0;

        while(!queue.isEmpty()) {
            Pair front = queue.remove();

            if(front.x == m-1 && front.y == n-1) return front.distance;

            for (int i = 0; i < 4; i++) {
                int xx = front.x + xPos[i];
                int yy = front.y + yPos[i];

                if(!(0 <= xx && xx < m && 0 <= yy && yy < n)) continue;

                if(visited[yy][xx] > front.drill) { // 방문 이력이 있는 노드는 방문하지 않음
                    if(arr[yy][xx] == 0) {
                        queue.add(new Pair(xx, yy, front.distance + 1, front.drill));
                        visited[yy][xx] = front.drill; // 이전에 벽을 뚫은 이력이 있다면 1 없다면 0
                    } else { // 벽을 만났을 때
                        if(front.drill == 0) { // 지금까지 경로 중에 벽을 뚫은 적이 없다면?
                            queue.add(new Pair(xx, yy, front.distance + 1, front.drill + 1)); // 벽을 뚫고
                            visited[yy][xx] = front.drill + 1; // 벽을 뚫었으므로 1로 세팅
                        }
                    }
                }
            }
        }

        return -1;
    }

    private static class Pair {
        int x;
        int y;
        int distance; // 현재까지 걸리는 거리
        int drill; // 벽을 부순 횟수

        public Pair(int x, int y, int distance, int drill) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.drill = drill;
        }
    }
}
