package baekjoon.ps10greedy;

        import java.io.*;

public class P04_Knight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        if (n == 1) bw.write("1");
        else if (n == 2) bw.write(Math.min(4, (m + 1) / 2)+"");
        else if(m < 7) bw.write(Math.min(4, m)+"");
        else bw.write((m - 7 + 5) + "");
        bw.flush();
        bw.close();
    }
}
