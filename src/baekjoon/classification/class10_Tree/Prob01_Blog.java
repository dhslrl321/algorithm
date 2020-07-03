package baekjoon.classification.class10_Tree;

import java.util.Comparator;

public class Prob01_Blog {
    public static void main(String[] args) {

    }
}

class BinarySearchTree<K, V> {
    private Node<K, V> root;
    private Comparator<? super K> comparator = null;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(Node<K, V> root, Comparator<? super K> comparator) {
        this.root = root;
        this.comparator = comparator;
    }

    static class Node<K, V>{
        private K key;
        private V data;
        private Node<K, V> left;
        private Node<K, V> right;

        public Node(K key, V data, Node<K, V> left, Node<K, V> right) {
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public K getKey() {
            return key;
        }

        public V getData() {
            return data;
        }

        void printData(){
            System.out.println(data);
        }
    }
}


