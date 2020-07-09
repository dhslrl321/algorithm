package baekjoon.classification.class02_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Prob09_PostfixOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        char[] word = expression.toCharArray();

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char iter : word){
            if(65 <= iter &&  iter <=90) {
                sb.append(iter);
            } else if(iter == '*' || iter == '+' || iter == '-' || iter == '/'){
                stack.push(iter);
            } else if(iter == ')'){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }

        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
        }
        System.out.println(sb.toString());
    }
}
