package solved.impl;

import java.io.*;
import java.util.*;


public class B2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr = str.split("");
        boolean flag = true;
        int count = 1;
        int answer = 0;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            String now = arr[i];
            if (now.equals("(")) {
                stack.push(now);
                count *= 2;
            } else if (now.equals("[")) {
                stack.push(now);
                count *= 3;
            } else {
                if (now.equals(")")) {
                    if (stack.empty() || !stack.peek().equals("(")) {
                        flag = false;
                        break;
                    }

                    if (arr[i-1].equals("(")) {
                        answer += count;
                    }
                    stack.pop();
                    count /= 2;
                } else if (now.equals("]")) {
                    if (stack.empty() || !stack.peek().equals("[")) {
                        flag = false;
                        break;
                    }
                    if (arr[i-1].equals("[")) {
                        answer += count;
                    }
                    stack.pop();
                    count /= 3;
                } else {
                    flag = false;
                    break;
                }
            }
        }

        if (!flag || !stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }

}
