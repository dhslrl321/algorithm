package algorithm.class02_Stack;
/*
*  BOJ 10828 번
*  https://www.acmicpc.net/problem/10828
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prob01_Stack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int roop = input.nextInt();
        String statement = null;
        String[] str;
        MyStack stack = new MyStack(roop);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= roop; i++) {
            statement = input.nextLine();
            str = statement.split(" ");
            if(str[0].equals("push")){
                stack.push(Integer.parseInt(str[1]));
            }

            if(statement.equals("pop")) ans.add(stack.pop());
            else if(statement.equals("top")) ans.add(stack.top());
            else if(statement.equals("empty")) ans.add(stack.empty());
            else if(statement.equals("size")) ans.add(stack.size());
        }

        for( int i : ans){
            System.out.println(i);
        }

    }
}

class MyStack {
    private int ptr;
    private int max;
    private int[] stack;

    public MyStack(int capacity){
        max = capacity;
        stack = new int[max];
    }

    // push
    void push(int x){
        if(ptr >= max) throw new RuntimeException();
        else stack[ptr++] = x;
    }

    // pop
    int pop(){
        if (ptr <= 0) return -1;
        return stack[--ptr];
    }

    // size
    int size(){
        return ptr;
    }

    // empty
    int empty() {
        if(ptr <= 0) return 1;
        else return 0;
    }

    // top
    int top(){
        if (ptr <= 0) return -1;
        else return stack[ptr-1];
    }
}
