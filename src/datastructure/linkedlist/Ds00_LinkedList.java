package datastructure.linkedlist;

public class Ds00_LinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(11);
        list.add(33);

        list.add(1, 22);

        list.print();

        list.remove();

        list.print();

        System.out.println(list.get(0) + " ");
    }
}

class MyNode {
    private int data; // 실제 값, actual value
    private MyNode nextNode; // 다음 노드를 가리키는 위치(주소) 포인터

    MyNode(int data) {
        this.data = data;
        this.nextNode = null;
    }

    void setNextNode(MyNode nextNode) {
        this.nextNode = nextNode;
    }

    MyNode getNextNode() {
        return nextNode;
    }

    int getData() {
        return data;
    }
}

class LinkedList {
    private MyNode headNode;

    LinkedList() {
        headNode = null;
    }

    // 마지막에 노드 추가
    void add(int data) {
        MyNode newNode = new MyNode(data);

        if(headNode == null) { // head 포인터가 없을 때, 연결 리스트가 비어있을 때
            this.headNode = newNode;
        }else { // head 포인터가 존재할 때, 연결 리스트에 데이터가 있을 때
            MyNode pointerNode = headNode;

            while(pointerNode.getNextNode() != null) {
                pointerNode = pointerNode.getNextNode();
            }
            pointerNode.setNextNode(newNode);
        }
    }

    // 특정 인덱스에 노드 추가
    void add(int index, int data) {
        MyNode newNode = new MyNode(data);
        if(headNode == null) {
            headNode = newNode;
        }else {
            MyNode pointerNode = headNode;
            while(index > 1) {
                pointerNode = pointerNode.getNextNode();
            }
            // 인덱스가 마지막 노드일 경우
            if(pointerNode.getNextNode() == null) {
                pointerNode.setNextNode(newNode);
            }else {
                // 새로운 노드가 가리키는 노드는 이전에 연결된 노드
                MyNode preNode = pointerNode;
                newNode.setNextNode(preNode.getNextNode());
            }
            pointerNode.setNextNode(newNode);
        }
    }

    void remove() {

        MyNode pointerNode = headNode;
        MyNode previousNode = pointerNode;

        if(headNode == null) {
            return;
        }

        if(headNode.getNextNode() == null) {
            headNode = null;
        } else {
            while(pointerNode.getNextNode() != null) {
                previousNode = pointerNode;
                pointerNode = pointerNode.getNextNode();
            }

            previousNode.setNextNode(null);
        }
    }


    int get(int index) {
        MyNode pointerNode = this.headNode;

        if(headNode == null) {
            return -1;
        }else {
            while(index-- > 0) {
                pointerNode = pointerNode.getNextNode();
            }
            return pointerNode.getData();
        }
    }

    void print() {
        MyNode pointerNode = this.headNode;
        int index = 0;

        while(pointerNode != null) {
            System.out.println("index: " + index + " data: " + pointerNode.getData());
            pointerNode = pointerNode.getNextNode();
            index++;
        }
    }
}