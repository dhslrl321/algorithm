package solved.impl;

import java.io.*;

public class B11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split("");

        int index = 0;
        for (int i = 0; i < inputs.length; i++) {
            System.out.print(inputs[i]);
            index++;
            if(index == 10) {
                System.out.println();
                index = 0;
            }
        }

        bw.flush();
        bw.close();
    }
}
