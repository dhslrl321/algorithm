package solved.greedy;

import java.io.*;

public class B13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] distances = new int[n-1];
        int[] prices = new int[n];

        String[] s = br.readLine().split(" ");

        for (int i = 0; i < distances.length; i++) {
            distances[i] = Integer.parseInt(s[i]);
        }

        s = br.readLine().split(" ");

        for (int i = 0; i < prices.length; i++) {
            prices[i] = Integer.parseInt(s[i]);
        }

        int answer = 0;

        for (int i = 0; i < n - 1; i++) {

            int km = distances[i];

            for (int j = i + 1; j < n; j++) {
                if(prices[i] > prices[j]) {
                    i = j;
                    answer += km * prices[i];
                    break;
                }else {
                    km += distances[i];
                }
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}
