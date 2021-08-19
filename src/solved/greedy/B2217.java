package solved.greedy;

import java.io.*;

public class B2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] lopes = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            lopes[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, lopes[i]);
        }

        int weight = max;

        loop: while(true) {
            weight++;
            double div = (double) weight / (double) n;

            for(int lope : lopes) {
                // 나눈 무게가 로프보다 하나라도 큰게 있으면 더 이상 추가하면 안됨
                if(lope < div) {
                    break loop;
                }
            }
        }

        bw.write(String.valueOf(weight - 1));

        bw.flush();
        bw.close();
    }
}
