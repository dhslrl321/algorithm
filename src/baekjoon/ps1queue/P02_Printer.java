package baekjoon.ps1queue;

import java.io.*;
import java.util.*;

class P02_Printer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            String[] nm = br.readLine().split(" ");

            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);

            Queue<Data> queue = new LinkedList<>();

            String[] str = br.readLine().split((" "));
            int[] priorities = new int[n];
            for (int i = 0; i < str.length; i++) {
                priorities[i] = Integer.parseInt(str[i]);
                Data data = new Data(Integer.parseInt(str[i]), m == i);
                queue.add(data);
            }

            reverseOrder(priorities);

            int index = 0;
            while(!queue.isEmpty()) {
                Data now = queue.remove();
                int stage = priorities[index];
                if(stage == now.num) {
                    if(now.flag) {
                        bw.write(++index + "\n");
                        break;
                    }
                    ++index;
                }else {
                    queue.add(now);

                }
            }
        }

        bw.flush();
        bw.close();
    }

    private static void reverseOrder(int[] arr) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}

class Data {
    int num;
    boolean flag;
    Data(int num, boolean flag){
        this.num = num;
        this.flag = flag;
    }
}
