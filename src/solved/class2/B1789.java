package solved.class2;

import java.io.*;

public class B1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long s = Long.parseLong(br.readLine());

        long tempNumber = s;
        long index = 1;

        int answer = 0;

        while(true) {
            tempNumber -= index++;
            answer++;
            if(tempNumber <= 0) break;
        }

        answer -= (tempNumber < 0) ? 1 : 0;

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}
