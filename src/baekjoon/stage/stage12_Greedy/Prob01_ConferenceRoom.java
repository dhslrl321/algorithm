package baekjoon.stage.stage12_Greedy;

import java.util.*;
import java.io.*;

public class Prob01_ConferenceRoom {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                time[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // sort by end time, if the same, start time.
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] arg0, int[] arg1) {
                if(arg0[1] == arg1[1]) return arg0[0] - arg1[0];
                else return arg0[1] - arg1[1];
            }
        });

        int end = -1;
        int count = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = 0; j < time[i].length; j++) {
                System.out.print(time[i][j]);
            }
            System.out.println();
        }
        // this part can be distinguish from other 'greedy algorithm'.
        // greedy algorithm : always find optimal result
        for (int i = 0; i < n; i++) { //compare all array index
            if(time[i][0] >= end){
                end = time[i][1];
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
