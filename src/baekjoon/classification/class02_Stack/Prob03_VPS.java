package baekjoon.classification.class02_Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob03_VPS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();
        int testCase = input.nextInt();
        for (int i = 0; i < testCase; i++) {

            String str = input.next();
            VPSChecker checker = new VPSChecker(str.length());

            if(checker.checker(str)) ans.add("YES");

            else ans.add("NO");
        }

        for(String a : ans){
            System.out.println(a);
        }
    }
}

class VPSChecker{
    private int ptr;
    private int max;
    private char[] stack;
    private boolean popErrFlag = false;

    public VPSChecker(int capacity){
        max = capacity;
        stack = new char[max];
    }

    public void push(){
        if(ptr >= max) System.out.println("푸시 오류");
        stack[ptr++] = '(';
    }

    public void pop(){
        if(ptr <= 0) popErrFlag = true;
        else --ptr;
    }

    public boolean isEmpty(){
        if(ptr == 0){
            return true;
        }else return false;
    }

    public boolean checker(String str){
        char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == '(') {
                push();
            }else {
                pop();
            }
        }
        if(isEmpty() && !popErrFlag) return true;
        else if(popErrFlag) return false;
        else return false;
    }
}