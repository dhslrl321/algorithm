package solved.class2;

import java.io.*;

public class B1929 {

    private static int[] numbers = new int[1_000_001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] mn = br.readLine().split(" ");

        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        bw.flush();
        bw.close();
    }

    private static void init(int max) {

        for (int i = 2; i <= max; i++) {

        }

    }
}
