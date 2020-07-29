package algorithm.theory.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    void dfs() {
        dfs(0);
    }

    void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        root.marked = true;
        while(!stack.isEmpty()){
            Node r = stack.pop();
            for(Node n : r.adjacency){
                if(!n.marked){
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }

    void bfs() {
        bfs(0);
    }

    void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        root.marked = true;
        while(!queue.isEmpty()) {
            Node r = queue.poll();
            for(Node n : r.adjacency){

                if (!n.marked) {
                    n.marked = true;
                    queue.poll();
                }
            }
        }
    }

    void dfsR(Node r){
        if (r == null) return;
        r.marked = true;
        visit(r);
        for(Node n : r.adjacency){
            if(!n.marked) {
                dfsR(n);
            }
        }
    }

    void dfsR(int index) {
        Node r = nodes[index];
        dfsR(r);
    }

    void dfsR() {
        dfsR(0);
    }

    void visit(Node n) {
        System.out.println(n.data + " ");
    }
}

