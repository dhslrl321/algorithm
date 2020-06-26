package algorithm.class12_Greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Prob02_MeetingRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Team[] teams = new Team[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            teams[i] = new Team(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(teams);
        int count = 1;
        int start = teams[0].start;
        int end = teams[0].end;
        for (int i = 1; i < n; i++) {
            if(end <= teams[i].start ) {
                count++;
                end = teams[i].end;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
    private static class Team implements Comparable<Team> {
        int start;
        int end;

        Team(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Team o) {
            return this.end - o.end;
        }
    }
}
