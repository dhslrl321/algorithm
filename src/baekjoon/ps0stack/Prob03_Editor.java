package baekjoon.ps0stack;

import java.io.*;

public class Prob03_Editor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String words = br.readLine();
        Stack stack = new Stack();
        char[] word = words.toCharArray();
        for(char ch : word) {
            stack.push(ch);
        }
        Stack tempStack = new Stack();
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {

            String cmd = br.readLine();

            if(cmd.charAt(0) == 'P') {
                cmdP(stack, cmd.charAt(2));
            }else {
                if(cmd.charAt(0) == 'L') {
                    cmdL(stack, tempStack);
                }else if(cmd.charAt(0) == 'D') {
                    cmdD(stack, tempStack);
                }else if(cmd.charAt(0) == 'B') {
                    cmdB(stack);
                }
            }
        }

        while(!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        while(!tempStack.isEmpty()) {
            bw.write(tempStack.pop());
        }

        bw.flush();
        bw.close();
    }

    private static void cmdL(Stack stack, Stack tempStack) {
        if(!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
    }
    private static void cmdD(Stack stack, Stack tempStack) {
        if(!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
    private static void cmdB(Stack stack) {
        if(!stack.isEmpty()) {
            stack.pop();
        }
    }
    private static void cmdP(Stack stack, char ch) {
        stack.push(ch);
    }
}
class Node {
    private char data;
    private Node link;

    Node(Node link, char data) {
        this.data = data;
        this.link = link;
    }

    char getData() {
        return data;
    }

    Node getLink() {
        return link;
    }
}
class Stack {
    Node top;

    Stack () {
        top = null;
    }
    boolean isEmpty() {
        return top == null;
    }

    void push(char data) {
        top = new Node(top, data);
    }

    char pop() {
        char ret = top.getData();
        top = top.getLink();
        return ret;
    }
}
