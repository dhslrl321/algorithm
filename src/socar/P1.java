package socar;

import java.util.Stack;

public class P1 {
    public static void main(String[] args) {
        // String s = "[]([[]){}";
        // String s = "(()()()";
        String s = "()()()))((((}{}{}{{{}{}{}{}{]";
        int count = 0;
        String invalidLetter = solution(s);

        invalidLetter = switchString(invalidLetter);

        for (int i = 0; i <= s.length(); i++) {
            String s2 = insertLetter(s.split(""), invalidLetter, i);

            if(solution(s2) == null) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static String insertLetter(String[] strings, String letter, int index) {
        StringBuilder sb = new StringBuilder();

        if(index == 0) {

        }

        for (int i = 0; i < index; i++) {
            sb.append(strings[i]);
        }
        sb.append(letter);
        for (int i = index; i < strings.length; i++) {
            sb.append(strings[i]);
        }

        return sb.toString();
    }

    private static String switchString(String str) {
        if(str.equals("]")) return "[";
        else if (str.equals("}")) return "{";
        else if (str.equals(")")) return "(";
        else if (str.equals("{")) return "}";
        else if (str.equals("[")) return "]";
        else return ")";
    }

    private static String solution(String s) {
        String[] strings = s.split("");

        String target = null;

        Stack<String> stack = new Stack<>();

        for (String str : strings) {
            if(str.equals("[") || str.equals("{") || str.equals("(")) {
                stack.push(str);
            } else if(str.equals("]") || str.equals("}") || str.equals(")")) {
                if(!stack.empty()) {
                    String top = stack.peek();

                    if(str.equals("]") && top.equals("[")) stack.pop();
                    else if (str.equals("}") && top.equals("{")) stack.pop();
                    else if (str.equals(")") && top.equals("(")) stack.pop();
                    else target = str;
                }
            }
        }

        if(!stack.empty()) {
            target = stack.pop();
        }

        return target;
    }
}
