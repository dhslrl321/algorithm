package solved.graph_search;

import java.io.*;
import java.util.*;

public class B2644 {

    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n == 1) {
            System.out.println(-1);
            return ;
        }

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        String[] targets = br.readLine().split(" ");

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            String[] relation = br.readLine().split(" ");
            int from = Integer.parseInt(relation[0]);
            int to = Integer.parseInt(relation[1]);
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        visited = new int[n + 1];

        int answer = getRelation(Integer.parseInt(targets[0]), Integer.parseInt(targets[1]));

        System.out.println(answer);
    }

    private static int getRelation(int from, int to) {

        Stack<Integer> stack = new Stack<>();

        stack.push(from);
        visited[from] = 0;

        int count = 0;

        boolean flag;

        while(!stack.isEmpty()) {

            flag = false;

            int top = stack.peek();

            if(top == to) {
                return visited[top];
            }

            for(int value : graph.get(top)) {
                if(visited[value] == 0) {
                    visited[value] = visited[top] + 1;
                    stack.push(value);
                    flag = true;
                    count++;
                    break;
                }
            }

            if(!flag) {
                stack.pop();
            }
        }
        return -1;
    }

    private static int getRelation2(int from, int to) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(from);
        visited[from] = 0;

        while(!queue.isEmpty()) {
            int front = queue.remove();

            if(front == to) {
                return visited[front];
            }

            for(int value : graph.get(front)) {
                if(visited[value] == 0) {
                    visited[value] = visited[front] + 1;
                    queue.add(value);
                }
            }
        }

        return -1;
    }
}
