package solved.greedy;

import java.io.*;
import java.util.*;

public class B1374 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Lecture> lectures = new LinkedList<>();
        PriorityQueue<Lecture> pq = new PriorityQueue<>();

        for (int i = 1; i <= n; i++) {
            String[] inputs = br.readLine().split(" ");
            lectures.add(new Lecture(
                    Integer.parseInt(inputs[1]),
                    Integer.parseInt(inputs[2]))
            );
            pq.add(new Lecture(
                    Integer.parseInt(inputs[1]),
                    Integer.parseInt(inputs[2])));
        }

        Collections.sort(lectures, (a, b) -> a.start - b.start);

        int count = 0;

        while(!lectures.isEmpty()) {
            int end = lectures.remove(0).end;

            int index = 1;

            while(index < lectures.size()) {
                int start = lectures.get(index).start;
                if(start > end) {
                    end = lectures.remove(index).end;
                }else {
                    index++;
                }
            }
            count++;
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
    }

}
class Lecture implements Comparable<Lecture> {
    int start;
    int end;

    Lecture(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Lecture lecture) {
        return this.start - lecture.start;
    }
}
