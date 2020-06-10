package algorithm.class02_Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Prob08_MetalStick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String stick = br.readLine();
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < stick.length(); i++) {
            if(stick.charAt(i) == '('){
                stack.push('(');
            }else {
                if(stick.charAt(i-1) == '(') { // 레이져인 경우
                    stack.pop();
                    ans += stack.size();
                }else {
                    ans += 1;
                    stack.pop();
                }
            }
        }
        System.out.println(ans);
    }
}
