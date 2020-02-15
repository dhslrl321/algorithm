
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        Stack<String> a = new Stack<>();
        a.push("asdf");
        a.push("afds");
        a.peek();
        a.pop();
        a.pop();
        System.out.println(a);
        System.out.println(a.empty());

    }
}
