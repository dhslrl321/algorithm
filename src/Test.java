
import java.util.Scanner;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(queue.iterator());
        System.out.println(list);
        try {
            if(queue.element() == 10) System.out.println(queue.peek());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }


}
