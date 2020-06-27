package theory.graph;

import java.util.LinkedList;
import java.util.List;

public class My_Graph {
    public static void main(String[] args) {

    }
}

class Adjacency_Matrix {
    private boolean[][] adjMatrix;
    private int vertex;

    public Adjacency_Matrix(int vertex){
        adjMatrix = new boolean[vertex][vertex];
    }

    void addEdge(int i, int j){
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    void removeEdge(int i, int j){
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }
}

class Adjacency_List {
    private LinkedList<Object>[] adjLists;
    private int vertex;

    private static class GraphNode {
        int vertex;
        GraphNode link;
    }

    GraphNode[] head = new GraphNode[10];
    int totalVertex = 0;

    void  insertVertex(int v){
        totalVertex ++;
    }

    void insertEdge(int v1, int v2) {
        if(totalVertex <= v1 || totalVertex <= v2){
            System.out.println("그래프에 없는 정점 입니다.");
        }else {
            GraphNode node = new GraphNode();
            node.vertex = v2;
            node.link = head[v1];
            head[v1] = node;

        }
    }
}