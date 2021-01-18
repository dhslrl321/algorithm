package datastructure.stack;

import java.util.Stack;

public class Prob01_check_matching {

    /* 예외 1 : stack 이 비어있는데 )}]를 만나서 pop 하려는 경우
    *  예외 2 : 문자열 검증이 끝났는데 stack 이 비어있지 않은 경우
    *  예외 3 : stack 에서 pop 한 값과 예상 값이 다른 경우
    **/
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String correct = "2 * (3 + 10)) - 1 + [(10 + 10 + {20 + 1})]";
        String incorrect = "[(({(])}))";
        int answer = 0;
        char[] arr = correct.toCharArray();

        for(char iter : arr) {
            pushStack(stack, iter);
            answer = checkCondition(stack, iter);
            if(answer != 0) break;
        }
        if(stack.isEmpty() && answer == 0) System.out.println("정답"); // 예외 2 검증
        else System.out.println("오답");
    }

    private static void pushStack(Stack<Character> stack, char c) {
        if((c == '(') || (c == '{') || (c == '[')) {
            stack.push(c);
        }
    }

    private static int checkCondition(Stack<Character> stack, char c) {
        if((c == ')') || (c == '}') || (c == ']')) {
            if(stack.isEmpty()) return 1; // 예외 1
            else { // 예외 3
                char pop = stack.pop();
                if( (pop == '(' && c == ')')
                        || (pop == '{' && c == '}')
                        || (pop == '[' && c == ']')) return 0;
                else return 3;
            }
        }
        return 0;
    }
}
