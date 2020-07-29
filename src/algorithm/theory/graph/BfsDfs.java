package algorithm.theory.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BfsDfs {
    public static void main(String[] args) {

    }
}
class Graph {

    private static class Node {
        int data;
        LinkedList<Node> adjacency;
        boolean marked;

        Node(int data) {
            this.data = data;
            this.marked = false;
            adjacency = new LinkedList<>();
        }
    }

    Node[] nodes;
    Graph(int size) {
        nodes = new Node[size];

        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }
    }

    void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if(!n1.adjacency.contains(n2)) {
            n1.adjacency.add(n2);
        }
        if(!n2.adjacency.contains(n1)) {
            n2.adjacency.add(n1);
        }
    }
}

