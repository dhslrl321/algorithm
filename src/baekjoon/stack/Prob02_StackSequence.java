package baekjoon.stack;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class Prob02_StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int input; // 입력 받은 값
        int max = 0; // stack 안에서 제일 큰 값
        int top = 0; // stack 에서 최상단에 있는 값
        int[] stack = new int[n];

        while(n-- > 0) { // 입력받은 횟수만큼
            input = Integer.parseInt(br.readLine());
            if(input > max) { // 스택에 값이 없을 때
                for(int i = max+1; i <= input; i++) {
                    stack[top++] = i;
                    sb.append("+\n");
                }
                max = input;
            }else if(stack[top-1] != input) {
                System.out.println("NO");
                return;
            }
            top--;
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}
