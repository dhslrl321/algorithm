package solved.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class B5014 {

    private static int f, s, g, u, d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] fsgud = br.readLine().split(" ");

        f = Integer.parseInt(fsgud[0]); // 총 층수
        s = Integer.parseInt(fsgud[1]); // 시작 층
        g = Integer.parseInt(fsgud[2]); // 목표 층
        u = Integer.parseInt(fsgud[3]); // 한 번에 올라갈 수 있는 수
        d = Integer.parseInt(fsgud[4]); // 한 번에 내려갈 수 있는 수

        int[] upAndDown = {u, -1 * d};

        int[] visited = new int[f + 1];
        boolean[] check = new boolean[f + 1];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(s);
        visited[s] = 1;
        check[s] = true;

        while(!queue.isEmpty()) {
            int front = queue.remove();

            if(front == g) {
                System.out.println(visited[front] - 1);
                return;
            }

            for (int i = 0; i < 2; i++) {

                int next = front + upAndDown[i];

                if(0 < next && next <= f) {
                    if(visited[next] == 0 && !check[next]) {
                        visited[next] = visited[front] + 1;
                        check[next] = true;
                        queue.add(next);
                    }
                }
            }
        }

        if(s == g) {
            bw.write("0");
        } else {
            bw.write("use the stairs");
        }

        bw.flush();
        bw.close();
    }
}
