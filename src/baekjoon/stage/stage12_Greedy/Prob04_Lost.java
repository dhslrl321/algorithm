package baekjoon.stage.stage12_Greedy;

import java.io.*;
import java.util.*;

public class Prob04_Lost {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String exp = br.readLine();
        StringTokenizer st = new StringTokenizer(exp, "+-", true);

        List<String> list = new ArrayList<>();

        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }

        int flag = 1;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("-")) {
                flag++;

            }
            else if(list.get(i).equals("+")){

            }else {
                if(flag % 2 != 0){
                    sum += Integer.parseInt(list.get(i));
                }else {
                    sum -= Integer.parseInt(list.get(i));
                }
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}


