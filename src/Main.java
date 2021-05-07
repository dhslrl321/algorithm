import java.io.*;
import java.util.ArrayList;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    static int[][] land = {
            {1, 4, 8, 10},
            {5, 5, 5, 5},
            {10, 10, 10, 10},
            {10, 10, 10, 20}
    };

    static int height = 3;

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        out.println(solution(land, height));
    }

    private static int solution(int[][] land, int height) {
        int answer = 0;

        // 인접 리스트 초기화
        for (int i = 0; i <= land.length; i++) {
            graph.add(new ArrayList<>());
        }
        
        // 그래프 연결
        for (int i = 0; i < land.length; i++) {

        }

        return answer;
    }
}
