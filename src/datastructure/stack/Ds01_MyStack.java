package datastructure.stack;

class Test {
    public static void main(String[] args) {
        Ds01_MyStack stack = new Ds01_MyStack(5);

        stack.push(10);
        System.out.println(stack.pop());
    }
}

class Ds01_MyStack {
    private int[] stack;
    private int MAX_STACK_SIZE;
    private int top;

    Ds01_MyStack(int size) {
        top = -1;
        MAX_STACK_SIZE = size;
        stack = new int[MAX_STACK_SIZE];
    }

    /* 스택이 비어있는 경우 false 반환*/
    boolean isEmpty() {
        return top == -1;
    }

    /* 스택이 가득 찬 경우 true 반환*/
    boolean isFull() {
        return top == MAX_STACK_SIZE - 1;
    }

    /* 스택에 삽입 연산 */
    void push(int x) {
        if(isFull()) MyException();
        else stack[++top] = x;
    }

    int pop() {
        int ret = 0;

        if(isEmpty()) MyException();
        else ret = stack[top--];

        return ret;
    }

    void shift() {

    }

    void peek() {
        int ret = 0;

        if(isEmpty()) MyException();
        else ret = stack[top];
    }

    void MyException() {
        System.out.println("Exception detected");
    }
}
