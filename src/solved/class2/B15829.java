package solved.class2;

import java.io.*;
import java.util.stream.IntStream;

public class B15829 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long R = 1;
        int M = 1234567891;

        int n = Integer.parseInt(br.readLine());

        char[] chars = br.readLine().toCharArray();

        int[] charCodes = new int[n];

        IntStream.range(0, n).forEach(i -> {
            charCodes[i] = chars[i] - 'a' + 1;
        });

        long hash = 0;

        for (int i = 0; i < charCodes.length; i++) {
            hash += (charCodes[i]) * R;
            hash %= M;

            R *= 31;
            R %= M;
        }

        bw.write(String.valueOf(hash));
        bw.flush();
        bw.close();
    }
}