package solved.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class B1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            Applicant[] applicants = new Applicant[n];

            for (int i = 0; i < n; i++) {
                int[] s = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
                applicants[i] = new Applicant(s[0], s[1]);
            }
            Arrays.sort(applicants, (a, b) -> a.paper - b.paper);

            int cutLine = applicants[0].interview;

            int count = 1;

            for (int i = 1; i < applicants.length; i++) {
                if(applicants[i].interview < cutLine) {
                    count++;
                    cutLine = applicants[i].interview;  // ???
                }
            }

            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static class Applicant {
        int paper;
        int interview;

        public Applicant(int paper, int interview) {
            this.paper = paper;
            this.interview = interview;
        }
    }
}
