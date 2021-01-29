package datastructure.linkedlist;

class Node {
    private int data;
    private Node link;

    Node(Node link, int data) {
        this.data = data;
        this.link = link;
    }
    int getData() {
        return data;
    }

    Node getLink() {
        return link;
    }

    void setData(int data) {
        this.data = data;
    }

    void setLink(Node link) {
        this.link = link;
    }
}

public class Ds02_LinkedQueue {
    public static void main(String[] args) {
        Ds02_LinkedQueue queue = new Ds02_LinkedQueue();

        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
    private Node front;
    private Node rear;

    Ds02_LinkedQueue() {
        front = rear = null;
    }
    boolean isEmpty() {
        return rear == null && front == null;
    }
    void enqueue(int data) {
        Node lastNode = rear;
        rear = new Node(null, data);

        if(isEmpty()) {
            front = rear;
        }else {
            lastNode.setLink(rear);
        }
    }

    int dequeue() {
       if(isEmpty()) {
           System.out.println("Queue Empty Exception");
           return -1;
       }else {
           int ret = front.getData();
           front = front.getLink();
           return ret;
       }
    }
}
