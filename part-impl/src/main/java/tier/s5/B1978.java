package tier.s5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1978 {
    public static void main(String[] args) throws IOException {
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        String[] numbersInput = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(numbersInput[i]);
        }

        for (int i : numbers) {
            if (isPrimeNumber(i)) {
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

    private static boolean isPrimeNumber(int i) {
        int factor = 2;
        while(factor <= i) {
            if (i % factor == 0) {
                return factor == i;
            }
            factor++;
        }

        return false;
    }
}
