package algorithm.theory.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class My_SecondGraph {

    public static void main(String[] args) {

    }

    private static class AdjList {
        private ArrayList<ArrayList<Integer>> adjList;

        AdjList(int size){
            adjList = new ArrayList<ArrayList<Integer>>();
        }

        public ArrayList<ArrayList<Integer>> getGraph() {
            return adjList;
        }

        /*그래프 특정 노드 get*/
        public ArrayList<Integer> getNode(int index){
            return adjList.get(index);
        }

        /*양방향 그래프 추가*/
        public void insertBidirectional(int edge1, int edge2){
            adjList.get(edge1).add(edge2);
            adjList.get(edge2).add(edge1);
        }

        /*단당향 그래프 추가*/
        public void insertSingle(int edge1, int edge2){
            adjList.get(edge1).add(edge2);
        }

        /*그래프 출력*/
        void printGraph(){
            for (int i = 0; i < adjList.size(); i++) {
                System.out.println("정점 " + i + "의 리스트" );
                for (int j = 0; j < adjList.get(i).size(); j++) {
                    System.out.print( " -> " + adjList.get(i).get(j));
                }
                System.out.println();
            }
        }
    }

    private static class AdjMatrix {

        private int[][] adjMatrix;

        AdjMatrix(int size) {
            // 우리는 index + 1 시작할 것이므로 size + 1 만큼 초기
            adjMatrix = new int[size+1][size+1];
        }

        public int[][] getGraph() {
            return adjMatrix;
        }

        /*양방향 그래프*/
        public void insertBidirectional(int edge1, int edge2){
            adjMatrix[edge1][edge2] = adjMatrix[edge2][edge1] = 1;
        }
        /*단방향 그래프*/
        public void insertSingle(int edge1, int edge2){
            adjMatrix[edge1][edge2] = 1;
        }
        /*그래프 출*/
        public void printGraph() {
            for (int i = 0; i < adjMatrix.length; i++) {
                for (int j = 0; j < adjMatrix[i].length; j++) {
                    System.out.print(" " + adjMatrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}


