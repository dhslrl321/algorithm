package solved.binarysearch;

import java.io.*;
import java.util.*;

public class P2776 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] note1 = new int[n];
            String[] inputs = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                note1[i] = Integer.parseInt(inputs[i]);
            }

            int m = Integer.parseInt(br.readLine());
            Arrays.sort(note1);

            String[] inputs2 = br.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                int target = Integer.parseInt(inputs2[i]);

                int start = 0;
                int end = note1.length - 1;
                int answer = 0;
                while (start <= end) {
                    int mid = (start + end) / 2;

                    if (note1[mid] == target) {
                        answer = 1;
                        break;
                    } else if (note1[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }

                bw.write(answer + "\n");
            }

        }

        bw.flush();
        bw.close();
    }
}
