package solved.class2;

import java.io.*;
import java.util.Arrays;

public class B4153 {

    private static final String WRONG = "wrong";
    private static final String RIGHT = "right";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String[] inputs = br.readLine().split(" ");

            int[] numbers = Arrays.asList(inputs).stream().mapToInt(Integer::parseInt).toArray();

            Arrays.sort(numbers);

            int side1 = numbers[0];
            int side2 = numbers[1];
            int base = numbers[2];

            if(side1 == 0 && side2 == 0 && base == 0) break;

            int n1 = side1 * side1;
            int n2 = side2 * side2;
            int n3 = base * base;

            if(n3 == n1 + n2) bw.write(RIGHT + "\n");
            else bw.write(WRONG + "\n");

        }

        bw.flush();
        bw.close();
    }
}
