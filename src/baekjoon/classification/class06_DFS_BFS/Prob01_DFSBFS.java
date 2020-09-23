package baekjoon.classification.class06_DFS_BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prob01_DFSBFS {
    public static void main(String[] args) {

    }
}

class MyNode {
    int data;
    MyNode left;
    MyNode right;
}

class Tree {
    public MyNode root;

    public void setRoot(MyNode node) {
        this.root = root;
    }

    public MyNode getRoot() {
        return root;
    }

    public MyNode addNode(MyNode left, int data, MyNode right){
        MyNode node = new MyNode();
        node.data = data;
        node.left = left;
        node.right = right;

        return node;
    }
}
