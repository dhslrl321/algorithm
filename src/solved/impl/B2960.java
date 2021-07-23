package solved.impl;

import java.io.*;

public class B2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        // 2 ~ n 까지
        int[] numbers = new int[n + 1];

        int count = 0;

        loop: for (int i = 2; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j += i) {
                if(numbers[j] == 0) {
                    numbers[j] = 1;
                    count++;
                    if(count == k) {
                        bw.write(j + "\n");
                    }
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
