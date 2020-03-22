package algorithm.class02_Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Prob05_FlippingWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        int t = input.nextInt();
        String[] word = new String[t];
        String[] name = new String[t];
        for (int i = 0; i < word.length; i++) {
            word[i] += "\n";
            char[] ans = word[i].toCharArray();

            for (int j = 0; j < ans.length; j++) {
                if(ans[j] == ' ' || ans[j] == '\n') {
                    while(!stack.isEmpty()){
                        name[i] += stack.pop();
                    }
                    name[i] += " ";
                }else stack.push(ans[j]);
            }
        }

        for(String iter : word) System.out.println(iter);

    }
}