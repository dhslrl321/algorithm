package algorithm.class02_Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Prob04_BalancedWorld {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();
        BalancedWorldChecker balancedWorldChecker = new BalancedWorldChecker();

        while(true){
            String str = input.nextLine();
            if(str.equals(".")) break;
            else ans.add(balancedWorldChecker.checker(str));
        }
        for(String a : ans) System.out.println(a);
    }
}

class BalancedWorldChecker {

    String checker(String str){
        Stack<Character> stack = new Stack<>();

        char[] temp = str.toCharArray();

        for (int i = 0; i < temp.length; i++) {
            try {
                if (temp[i] == '(') stack.push('(');
                else if (temp[i] == '[') stack.push('[');
                if(temp[i] == ']') {
                    if((stack.peek() == '[') && !stack.empty()) stack.pop();
                    else return "no";
                }
                else if(temp[i] == ')'){
                    if(stack.peek() == '(' && !stack.empty()) stack.pop();
                    else return "no";
                }
            } catch (EmptyStackException e) {
                return "no";
            }
        }
        if(stack.empty()) return "yes";
        else return "no";
    }
}
