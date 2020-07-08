package algorithm.theory.tree;

public class TreeTraversal {
    public static void main(String[] args) {

    }
}

class TraversalNode{
    int data;
    TraversalNode rightNode;
    TraversalNode leftNode;
}

class TraversalTree{
    TraversalNode root;

    TraversalNode getRoot() {
        return root;
    }

    void setRoot(TraversalNode root) {
        this.root = root;
    }

    /*노드를 만드는 메서드*/
    void makeNode(int data, TraversalNode left, TraversalNode right){
        TraversalNode node = new TraversalNode();
        node.data = data;
        node.leftNode  = left;
        node.rightNode = right;
    }

    void inOrder(TraversalNode node){

        if (node != null){
            inOrder(node.leftNode);
            System.out.println(node.data);
            inOrder(node.rightNode);
        }
    }

    void preOrder(TraversalNode node){
        if(node != null){
            System.out.println(node.data);
            preOrder(node.leftNode);
            preOrder(node.rightNode);
        }
    }

    void postOrder(TraversalNode node){
        if(node != null){
            postOrder(node.leftNode);
            postOrder(node.rightNode);
            System.out.println(node.data);
        }
    }
}