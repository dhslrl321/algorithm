package stage.stage12_Greedy;

import java.io.*;

public class Prob02_Change {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int change = Integer.parseInt(br.readLine());
        change = 1000 - change;
        int count = 0;
        int[] changes = {500, 100, 50, 10, 5, 1};

        for (int i = 0; i < changes.length; i++) {
            if(change / changes[i] >= 0){
                count += change / changes[i];
                change = change % changes[i];
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
