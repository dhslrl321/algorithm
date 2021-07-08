package solved.class2;

import java.io.*;

public class B2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int target = Integer.parseInt(br.readLine());

        int maxNumber = 1;

        int answer = 1;

        for (int i = 1; i <= 1_000_000_000; i++) {

            if(target == 1) break;

            int boundary = 6 * i;
            maxNumber += boundary;

            if(maxNumber >= target) {
                answer++;
                break;
            }

            answer++;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
