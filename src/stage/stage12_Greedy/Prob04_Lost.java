package stage.stage12_Greedy;

import java.io.*;
import javax.script.*;
import java.lang.reflect.Array;
import java.util.*;

public class Prob04_Lost {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String exp = br.readLine();
        StringTokenizer st = new StringTokenizer(exp, "+-");
        char[] arr = exp.toCharArray();
        List<String> list = new ArrayList<>();

        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }



        bw.flush();
        bw.close();
    }
}
