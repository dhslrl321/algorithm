package solved.greedy;

import java.io.*;
import java.util.Arrays;

public class B15729 {

    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] ends = br.readLine().split(" ");
        String[] starts = new String[n];
        for (int i = 0; i < ends.length; i++) {
                starts[i] = "0";
        }

        for (int i = 0; i < ends.length; i++) {
            if (ends[i].equals(starts[i])) continue;
            toggleThree(starts, i);
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
    private static void toggleThree(String[] a1, int index) {
        for(int i = 0; i < 3; i++) {
            if(i + index < a1.length) {
                toggle(a1, i + index);
            }
        }
        answer++;
    }

    private static void toggle(String[] a1, int index) {
        if(a1[index].equals("0")) a1[index] = "1";
        else a1[index] = "0";
    }
}
