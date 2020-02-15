
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty");
        }


    }
}
