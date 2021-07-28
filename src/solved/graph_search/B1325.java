package solved.graph_search;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class B1325 {

    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static boolean[] visited;
    private static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] fromTo = br.readLine().split(" ");
            int from = Integer.parseInt(fromTo[0]);
            int to = Integer.parseInt(fromTo[1]);

            graph.get(from).add(to);
        }
        result = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            getMaxPen3(i);
        }

        int max = 0;

        for (int i = 1; i <= n; i++) {
            if(max < result[i]) {
                max = result[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            if(result[i] == max) {
                bw.write(i + " ");
            }
        }

        bw.flush();
        bw.close();
    }

    private static void getMaxPen(int x) {
        Stack<Integer> stack = new Stack<>();
        stack.push(x);
        visited[x] = true;
        boolean flag;

        while (!stack.isEmpty()) {
            int top = stack.peek();
            flag = false;
            for(int value : graph.get(top)) {
                if(!visited[value]) {
                    visited[value] = true;
                    flag = true;
                    stack.push(value);
                    result[value]++;
                    break;
                }
            }

            if(!flag) {
                stack.pop();
            }
        }
    }

    private static void getMaxPen2(int x) {
        visited[x] = true;
        for (int value : graph.get(x)) {
            if(!visited[value]) {
                getMaxPen2(value);
                result[value]++;
            }
        }
    }

    private static void getMaxPen3(int x) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(x);
        visited[x] = true;

        while(!queue.isEmpty()) {
            int front = queue.remove();
            for(int value : graph.get(front)) {
                if(!visited[value]) {
                    visited[value] = true;
                    queue.add(value);
                    result[value]++;
                }
            }
        }
    }
}
