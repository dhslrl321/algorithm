package algorithm.theory.stack;

import java.util.Arrays;

public class StackMain {
    public static void main(String[] args) {

        Stack stack = new Stack(29);

        stack.push(10);
        stack.pop();
        System.out.println(stack.toStringStack());

    }
    private static class Stack{
        int size;
        int[] arr;
        int ptr;
        Stack(int size){
            this.size = size;
            this.ptr = 0;
            arr = new int[this.size];
        }

        /*push*/
        void push(int data){
            if(ptr < size){
                arr[ptr++] = data;
            }else {
                System.out.println("Stack is Full");
            }
        }

        /*pop*/
        int pop(){
            if(ptr != 0){
                return arr[ptr--];
            }else {
                System.out.println("Stack is Empty");
                return -1;
            }
        }

        /*peek*/
        int peek(){
            if(ptr != 0){
                return arr[ptr];
            }else {
                System.out.println("Stack is Empty");
                return -1;
            }
        }

        /*isEmpty*/
        boolean isEmpty(){
            return ptr == 0;
        }

        /*size*/
        int size(){
            return ptr;
        }

        /*toString*/
        String toStringStack(){
            return Arrays.toString(arr);
        }
    }
}


