package solved.impl;

import java.io.*;
import java.util.*;

// 스택에 있는 값들의 출력 조건
//  1. < 를 만났음에도 불구하고 스택이 비어있지 않을 때
//  2. 공백을 만날 때
//  3. 전체가 끝났음에도 불구하고 스택이 비이었지 않을 때
public class B17413 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("");

        Stack<String> stack = new Stack<>();

        boolean isTag = false;

        for (String s : str) {
            if (s.equals("<")) {
                isTag = true;
                printStack(stack);
            } else if (s.equals(">")) {
                System.out.print(">");
                isTag = false;
                continue;
            }

            if (isTag) {
                System.out.print(s);
            } else {
                if (s.equals(" ")) {
                    printStack(stack);
                    System.out.print(" ");
                } else {
                    stack.push(s);
                }
            }
        }

        printStack(stack);

        bw.flush();
        bw.close();
    }

    private static void printStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
