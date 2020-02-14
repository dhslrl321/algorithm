package algorithm.class01_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob02_SnailWantToClimb {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int answer = 1, subValue = A - B;
        V -= A;
        int share = V / subValue;

        if (V - (subValue * share) <= 0) {
            answer += share;
        } else {
            answer += share + 1;
        }

        System.out.println(answer);

    }
}
