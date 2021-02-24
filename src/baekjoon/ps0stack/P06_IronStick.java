package baekjoon.ps0stack;

import java.io.*;
import java.util.Stack;
public class P06_IronStick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] n = br.readLine().split("");

        Stack<String> stack = new Stack<>();

        int answer = 0;
        for (int i = 0; i < n.length; i++) {
            String now = n[i];

            if(now.equals("(")) stack.push(now);
            else {
                if(n[i-1].equals("(")) {
                    stack.pop();
                    answer += stack.size();
                }else {
                    answer++;
                    stack.pop();
                }
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
