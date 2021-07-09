package solved.class2;

import java.io.*;

public class B14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] in = br.readLine().split(" ");

        int a = Integer.parseInt(in[0]) / Integer.parseInt(in[1]);

        if(Integer.parseInt(in[0]) % Integer.parseInt(in[1]) == 0) a -= 1;

        int answer = a * Integer.parseInt(in[2])* Integer.parseInt(in[3]);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
