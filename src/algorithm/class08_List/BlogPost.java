package algorithm.class08_List;

public class BlogPost {
    public static void main(String[] args) {

    }
}

class SimpleLinkedList {

    private Node headNode; // head node
    private Node tailNode; // tail node
    private int size; // list's size

    public SimpleLinkedList(){ // initialize list
        headNode = new Node(null);
        size = 0;
    }

    private class Node { // Node class

        private Object data; // Data Field
        private Node nextNode; // Link Field

        Node (Object data){
            this.data = data;
            nextNode = null;
        }
    }

    /*Head 에 삽입 하기.*/
    void addHead(Object data){

        Node newNode = new Node(data); // Make new Node
        newNode.nextNode = headNode; // set newNode's Link to head
        headNode = newNode; // swap headNode to newNode;
        size++;

        if(headNode.nextNode == null){ // check : Is headNode first
            tailNode =headNode;
        }
    }

    void addTail(Object data){
        if(size == 0){ // if list is empty
            addHead(data);
        }else {
            Node newNode = new Node(data); // Make new Node
            tailNode.nextNode = newNode; // update tail's next
            tailNode = newNode; // swap tailNode to newNode;
            size++;
        }
    }

    /*특정 위치의 노드 찾기*/
    Node node(int index){
        Node x = headNode;
        for (int i = 0; i < index; i++) { // index 까지 반복
            x = x.nextNode;               // 현재 노드에 다음 노드를 할당.
        }
        return x; // 특정 index 의 노드 반환
    }

    void add(Object data, int index){
        if(index == 0) addHead(data);
        else {
            Node temp1 = node(index - 1);
            Node temp2 = temp1.nextNode;

            Node newNode = new Node(data);
            temp1.nextNode = newNode;
            newNode.nextNode = temp2;
            size++;

            if(newNode.nextNode == null){
                tailNode = newNode;
            }
        }
    }

    /*Head 노드 삭제*/
    Object removeHead(){
        Node temp = headNode; // head 에 있는 data 임시 저장
        headNode = temp.nextNode; // headNode 를 기존의 두 번쨰 노드로 바꿔준다.
        /*노드 반환 과정*/
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    /*Tail 특정 노드 삭제*/
    Object removeNode(int index){
        if(index == 0) {
            removeHead();
        }

        Node temp = node(index -  1); // 특정 위치 전의 노드 찾기
        Node targetNode = temp.nextNode; // temp 노드의 다음 노드가 삭제될 노드
        temp.nextNode = temp.nextNode.nextNode; // temp 노드는 삭제될 다음 노드를 가리킴

        /*노드 반환 과정*/
        Object returnData = targetNode.data;

        if(targetNode == tailNode){
            tailNode = temp;
        }
        targetNode = null;
        size--;
        return returnData;
    }

}
