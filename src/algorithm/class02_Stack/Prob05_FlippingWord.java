package algorithm.class02_Stack;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Prob05_FlippingWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();

        int t = Integer.parseInt(br.readLine());
        String[] word = new String[t];

        for (int i = 0; i < t; i++) {
            word[i] = br.readLine();
        }

        for (int i = 0; i < word.length; i++) {
            word[i] += '\n';
            char[] arr = word[i].toCharArray();
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == ' ' || arr[j] == '\n'){
                    while(!stack.isEmpty()){
                        bw.write(stack.peek());
                        stack.pop();
                    }
                    bw.write(" ");
                }else stack.push(arr[j]);
            }
            bw.write('\n');
        }
        bw.flush();
        bw.close();
    }
}