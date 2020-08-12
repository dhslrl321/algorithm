package algorithm.theory.graph;

import java.util.LinkedList;

public class DfsBfs {
    public static void main(String[] args) {

    }
}

/*그래프 클래스*/
class Graph {

    private static class Node {
        int data; // 임의로 int 형을 데이터라고 하겠음
        LinkedList<Node> adjacent; // 인접 노드를 저장할 연결 리스트
        boolean marked; // 마킹 플래그

        /*Node 클래스의 생성자
        * 생성자에서 데이터를 받고 마킹 플래그를 false 로 지정*/
        Node(int data) {
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<>();
        }
    }
    Node[] nodes; // 그래프의 노드들을 저장할 배열
    /* 그래프 생성자
    * 사이즈만큼 그래프의 크기(노드 배열의 수)를 정의*/
    Graph(int size) {
        nodes = new Node[size];

        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i); // 임의로 노드 데이터와 인덱스를 같게 함
        }
    }

    void addEdge(int i1, int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if(!n1.adjacent.contains((n2))){

        }
    }
}
