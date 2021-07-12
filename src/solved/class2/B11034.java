package solved.class2;

import java.io.*;

public class B11034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        boolean[] cupHolder = new boolean[n + 1];

        boolean check = false;

        char[] seat = br.readLine().toCharArray();

        int count = 0;

        for (int i = 0; i < seat.length; i++) {
            if(seat[i] == 'L') {
                if(!check) {
                    check = true;
                    cupHolder[i + 1] = true;
                }
            }else {
                check = false;
            }

            if(!cupHolder[i]) {
                cupHolder[i] = true;
                count++;
            }
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
    }
}
