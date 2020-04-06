package stage.stage11_DynamicPrograming;

import java.io.*;
import java.util.StringTokenizer;


public class Prob12_OneTwoThreePlus2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[][] d = new int[t+1][4];

        d[1][2] = 1;
        d[1][3] = 1;

        d[2][1] = 1;
        d[2][3] = 1;

        d[3][1] = 2;
        d[3][2] = 2;



        bw.write(d[t][0] + "\n");
        bw.flush();
        bw.close();
    }
}
