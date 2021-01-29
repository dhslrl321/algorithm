package datastructure.linkedlist;

class StackNode {
    private int data;
    private StackNode link;

    /* 생성자 */
    StackNode(StackNode link, int data) {
        this.data = data;
        this.link = link;
    }

    int getData() {
        return this.data;
    }
    StackNode getLink() {
        return link;
    }
}

class Ds01_ListStack {
    public static void main(String[] args) {
        Ds01_ListStack stack = new Ds01_ListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    private StackNode top;
    private int size;

    Ds01_ListStack() {
        top = null;
    }

    boolean isEmpty() {
        return top == null;
    }

    void push(int data) {
        top = new StackNode(top, data);
    }

    int pop() {
        if(isEmpty()) {
            System.out.println("Stack Empty Exception");
            return -1;
        }
        int ret =  top.getData();
        top = top.getLink();
        return ret;
    }
}
