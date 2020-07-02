package programmers.level1;

import java.util.Arrays;

public class Prob09_MakeWeiredWord {
    public static void main(String[] args) {
        String a = "try hello world";
        System.out.println(solution(a));
    }
    private static String solution(String s){
        StringBuilder sb = new StringBuilder();
        String[] word = s.split("");
        int index = 1;
        for (int i = 0; i < word.length; i++) {
            if(word[i].equals(" ")) {
                index = 1;
                sb.append(" ");
            }
            else {
                if(index % 2 == 0) sb.append(word[i].toLowerCase());
                else sb.append(word[i].toUpperCase());
                index++;
            }
        }
        return sb.toString();
    }
}
