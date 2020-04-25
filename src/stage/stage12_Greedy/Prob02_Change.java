package stage.stage12_Greedy;

import java.io.*;

public class Prob02_Change {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int change = Integer.parseInt(br.readLine());
        change = 1000 - change;
        int count = 0;


        bw.write(String.valueOf(change));
        bw.flush();
        bw.close();
    }
}
