package solved.graph_search;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class B9019 {

    private static int[] depth;
    private static int a;
    private static int b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {

            String[] ab = br.readLine().split(" ");

            a = Integer.parseInt(ab[0]);
            b = Integer.parseInt(ab[1]);

            depth = new int[10000];
            String pair = getCommand();
            bw.write(pair + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static String getCommand() {
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair("", a));
        depth[a] = 1;

        while(!queue.isEmpty()) {
            Pair front = queue.remove();

            if(front.number == b) {
                return front.command;
            }

            int l = l(front.number);
            if(depth[l] == 0) {
                depth[l] = depth[front.number] + 1;
                queue.add(new Pair(front.command+"L", l));
            }

            int r = r(front.number);
            if(depth[r] == 0) {
                depth[r] = depth[front.number] + 1;
                queue.add(new Pair(front.command+"R", r));
            }

            int d = d(front.number);
            if(depth[d] == 0) {
                depth[d] = depth[front.number] + 1;
                queue.add(new Pair(front.command+"D", d));
            }

            int s = s(front.number);
            if(depth[s] == 0) {
                depth[s] = depth[front.number] + 1;
                queue.add(new Pair(front.command+"S", s));
            }
        }
        return null;
    }

    private static int d(int n) {
        n *= 2;
        if(9999 < n) n %= 10_000;
        return n;
    }

    private static int s(int n) {
        if(n == 0) n = 9999;
        else n -= 1;
        return n;
    }

    private static int l(int n) {
        return n % 1000 * 10 + n / 1000;
    }

    private static int r(int n) {
        return n % 10 * 1000 + n / 10;
    }
}

class Pair {
    String command;
    int number;

    public Pair(String command, int number) {
        this.command = command;
        this.number = number;
    }
}