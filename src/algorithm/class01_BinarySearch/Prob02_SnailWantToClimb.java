package algorithm.class01_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob02_SnailWantToClimb {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());

        int day = 0;
        int distance = 0;

        while(distance < line){

            distance += up - down;

            if(distance == line) break;
            day += 1;
        }
        System.out.println(day);
    }
}
