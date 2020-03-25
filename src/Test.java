import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        // reader
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // writer
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // testCase 받기
        int t = Integer.parseInt(bf.readLine());

        System.out.println(Math.min(10, 20));


        bw.write(t + "\n");

        bw.flush();
        bw.close();

    }
}
