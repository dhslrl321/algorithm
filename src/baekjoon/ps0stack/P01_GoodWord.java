package baekjoon.ps0stack;

import java.util.Scanner;
import java.util.Stack;

public class P01_GoodWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] words = new String[n];
        int answer = 0;

        for (int i = 0; i < words.length; i++) {
            words[i] = input.next();
        }

        for(String word : words) {
            Stack<Character> stack = new Stack<>();
            checkLogic(stack, word);
            if(stack.isEmpty()) answer++;
        }
        System.out.println(answer);
    }

    private static void checkLogic(Stack<Character> stack, String word) {
        stack.push(word.charAt(0));
        for (int i = 1; i < word.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == word.charAt(i)) {
                stack.pop();
                continue; // stack 에 있는 문자와 현재 문자가 같은 경우
            }
            stack.push(word.charAt(i));
        }
    }
}
