package solved.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> cranes = new ArrayList<>();
        ArrayList<Integer> boxes = new ArrayList<>();

        String[] craneString = br.readLine().split(" ");

        for(String crane : craneString) {
            cranes.add(Integer.parseInt(crane));
        }

        int m = Integer.parseInt(br.readLine());

        String[] boxString = br.readLine().split(" ");

        for(String box : boxString) {
            boxes.add(Integer.parseInt(box));
        }

        Collections.sort(cranes, Collections.reverseOrder());
        Collections.sort(boxes, Collections.reverseOrder());

        if(cranes.get(0) < boxes.get(0)) {
            bw.write(String.valueOf(-1));
            bw.flush();
            bw.close();
            return ;
        }

        int count = 0;

        while(!boxes.isEmpty()) {

            int index = 0;

            for (int i = 0; i < cranes.size();) {
                if(index == boxes.size()) break;
                if (cranes.get(i) >= boxes.get(index)) {
                    boxes.remove(index);
                    i++;
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
