package solved.class2;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class B11723 {

    private static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());

        while(loop-- > 0) {
            String[] operators = br.readLine().split(" ");

            String operator = operators[0];

            if(operators.length != 1) {

                int operand = Integer.parseInt(operators[1]);

                switch(operator) {
                    case "add" :
                        add(operand);
                        break;
                    case "remove":
                        remove(operand);
                        break;
                    case "check":
                        bw.write(check(operand) + "\n");
                        break;
                    case "toggle":
                        toggle(operand);
                        break;
                    default:
                        break;
                }
            }else {
                switch(operator) {
                    case "all":
                        all();
                        break;
                    case "empty":
                        empty();
                        break;
                    default:
                        break;
                }
            }
        }

        bw.flush();
        bw.close();
    }

    private static void add(int value) {
        set.add(value);
    }

    private static void remove(int value) {
        if(set.contains(value)) set.remove(value);
    }

    private static int check(int value) {
        if(set.contains(value)) return 1;
        else return 0;
    }

    private static void toggle(int value) {
        if(set.contains(value)) {
            remove(value);
        }else {
            add(value);
        }
    }

    private static void all() {
        IntStream.range(1, 21).forEach(i -> add(i));
    }

    private static void empty() {
        set.clear();
    }
}
