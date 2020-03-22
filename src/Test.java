import java.util.*;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);

        System.out.println(stack.isEmpty());
        String a = "hello";

        a += "world";
        System.out.println(a);
    }
}
