package algorithm.class02_Stack;

import java.io.*;
import java.util.*;

public class Prob07_PostMarkingFormula {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String expression = br.readLine();

        List<Character> answer = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            char word = expression.charAt(i);
            if(word >= 65 && word <= 90){
                answer.add(word);
            } else {
                // Push to Stack
            }
        }
        bw.write(answer.toString());

        bw.flush();
        bw.close();
    }
}
