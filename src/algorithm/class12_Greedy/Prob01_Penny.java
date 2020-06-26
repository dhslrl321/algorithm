package algorithm.class12_Greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Prob01_Penny {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input <= k) {
                list.add(input);
            }
        }

        int index = list.size() - 1;

        while(k > 0){
            if(k >= list.get(index)){
                count += k / list.get(index);
                k = k % list.get(index);
            }
            index--;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
