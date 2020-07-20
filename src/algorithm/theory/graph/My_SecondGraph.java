package algorithm.theory.graph;

import java.util.Scanner;

public class My_SecondGraph {

    static int nV; // 간선의 수
    static int nE; // 노드의 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        nV = sc.nextInt();
        nE = sc.nextInt();

        int[][] adjMatrix = new int[nV+1][nV+1]; //0, 0은 사용하지 않으므로 +1만큼의 사이즈를 할당

        for (int i = 0; i < nE; i++) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();

            adjMatrix[t1][t2] = adjMatrix[t2][t1]; // 행렬의 가로의 값과 세로의 값이 같으므
        }
    }
}
