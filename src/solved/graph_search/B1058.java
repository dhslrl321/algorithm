package solved.graph_search;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class B1058 {

    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] arr = {
                {"N", "Y", "N", "Y", "N"},
                {"N", "N", "Y", "N", "Y"},
                {"N", "Y", "N", "Y", "N"},
                {"Y", "N", "Y", "N", "N"},
                {"N", "Y", "N", "N", "N"},
        };

        for (int i = 0; i <= arr.length; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].equals("Y")) { // 연결됨
                    graph.get(i + 1).add(j + 1); // 상호 연결
                    graph.get(j + 1).add(i + 1); // 상호 연결
                }
            }
        }

        int max = 0;

        for (int i = 1; i <= arr.length; i++) {
            visited = new boolean[arr[0].length + 1];
            max = Math.max(max, dfs(i));
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }

    private static int dfs(int start) {
        Stack<Integer> stack = new Stack<>();

        stack.push(start); // 1 번 부터 출발
        visited[start] = true;
        boolean flag;

        int count = 0;

        while(!stack.isEmpty()) {
            int top = stack.peek(); // 스택 최상단 item

            flag = false;

            for(int value : graph.get(top)) {
                if(!visited[value]) { // 방문 이력이 없다면
                    visited[value] = true;
                    stack.push(value);
                    flag = true;
                    break;
                }
            }

            if(!flag) {
                stack.pop();
            }
        }
        return count;
    }
}
