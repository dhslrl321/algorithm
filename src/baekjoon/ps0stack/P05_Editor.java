package baekjoon.ps0stack;
import java.io.*;
import java.util.Stack;
public class P05_Editor {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        Stack<Character> tempStack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String words = br.readLine();

        char[] word = words.toCharArray();
        for(char ch : word) {
            stack.push(ch);
        }
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {

            String cmd = br.readLine();

            if(cmd.charAt(0) == 'P') {
                cmdP(stack, cmd.charAt(2));
            }else {
                if(cmd.charAt(0) == 'L') {
                    cmdL(stack, tempStack);
                }else if(cmd.charAt(0) == 'D') {
                    cmdD(stack, tempStack);
                }else if(cmd.charAt(0) == 'B') {
                    cmdB(stack);
                }
            }
        }

        while(!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        while(!tempStack.isEmpty()) {
            bw.write(tempStack.pop().toString());
        }
        bw.flush();
        bw.close();
    }

    private static void cmdL(Stack<Character> stack, Stack<Character> tempStack) {
        if(!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
    }
    private static void cmdD(Stack<Character> stack, Stack<Character> tempStack) {
        if(!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
    private static void cmdB(Stack<Character> stack) {
        if(!stack.isEmpty()) {
            stack.pop();
        }
    }
    private static void cmdP(Stack<Character> stack, char ch) {
        stack.push(ch);
    }

}
