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

    Adjacency_List(int vertex) {
        
    }
}