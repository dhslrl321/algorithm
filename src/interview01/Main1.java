package interview01;

import java.io.*;
import java.util.ArrayList;

public class Main1 {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] skills = br.readLine().split(" ");

        // 우선 char을 int로 바꿀 수 있는지 먼저 테스트
        /*skills[i] - 97*/
        visited = new boolean[skills.length + 1];
        for (int i = 0; i <= skills.length; i++) {
            graph.add(new ArrayList<>());
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] relation = br.readLine().toCharArray();
            graph.get(charToInt(relation[0])).add(charToInt(relation[2]));
        }

        for(ArrayList<Integer> a : graph) {
            System.out.println(a.toString());
    }
        bw.flush();
        bw.close();
    }

    private static int charToInt(char c) {return c - 97;}
}
