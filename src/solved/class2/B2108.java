package solved.class2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class B2108 {

    private static int[] count = new int[8001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());

            count[number + 4000]++;
            numbers[i] = number;
        }

        bw.write(average(numbers) + "\n");
        bw.write(middle(numbers) + "\n");
        bw.write(mode() + "\n");
        bw.write(range(numbers) + "\n");

        bw.flush();
        bw.close();
    }

    private static int average(int[] numbers) {

        int sum = 0;

        for(int value : numbers) {
            sum += value;
        }

        double round = (double) Math.round((double) sum / (double) numbers.length);

        return (int) round;
    }

    private static int middle(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[numbers.length / 2];
    }

    private static int mode() {
        List<Integer> temp = new ArrayList<>();
        int max = count[0];
        temp.add(0 - 4000);
        for (int i = 1; i < count.length; i++) {
            if(count[i] == max) {
                temp.add(i - 4000);
            } else if(count[i] > max) {
                max = count[i];
                temp.clear();
                temp.add(i - 4000);
            }
        }

        if(temp.size() > 1) {
            Collections.sort(temp);
            return temp.get(1);
        }else {
            return temp.get(0);
        }
    }

    private static int range(int[] numbers) {
        return numbers[numbers.length - 1] - numbers[0];
    }

}
