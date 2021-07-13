package solved.class2;

import java.io.*;
import java.util.Arrays;

public class B1105 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lr = br.readLine().split(" ");

        char[] l = lr[0].toCharArray();
        char[] r = lr[1].toCharArray();

        int answer = 0;
        if(l.length == r.length) {
            for (int i = 0; i < l.length; i++) {
                if(l[i] == r[i] && l[i] == '8') {
                    answer++;
                }else if(l[i] != r[i]){
                    break;
                }
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}
