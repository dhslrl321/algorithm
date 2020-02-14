package algorithm.class02_Stack;

import java.util.Scanner;

public class Prob02_Zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int capacity = input.nextInt();
        int num = 0;
        MyStackForZero stack = new MyStackForZero(capacity);

        while(capacity > 0){
            num = input.nextInt();
            if(num == 0){
                stack.pop();
            }else{
                stack.push(num);
            }
            capacity--;
        }
        System.out.println(stack.sum());
    }
}

class MyStackForZero {
    private int ptr;
    private int max;
    private int[] stack;

    public MyStackForZero(int capacity){
        max = capacity;
        stack = new int[max];
    }

    public void push(int x){
        if(ptr >= max){
            throw new RuntimeException();
        }
        stack[ptr++] = x;
    }

    public void pop(){
        if(ptr <= 0){
            throw new RuntimeException();
        }
        --ptr;
    }

    public int sum(){
        int sum = 0;
        for (int i = 0; i < ptr; i++) {
            sum += stack[i];
        }
        return sum;
    }
}
