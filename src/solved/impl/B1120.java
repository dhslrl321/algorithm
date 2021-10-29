package solved.impl;

import java.io.*;

public class B1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // a 문자열이 b 문자열에 가장 잘 fit 한게 어디인지 찾아야함
        // a 랑 b 랑 길이가 같으면 그냥 단순 비교하면 되고
        // 만약 a 가 b 보다 작은면 a 에서 b 에 포함되는 문자열이 가장 작을 때

        String[] ab = br.readLine().split(" ");

        String[] a = ab[0].split("");
        String[] b = ab[1].split("");

        int diff = b.length - a.length;

        int sameCount = Integer.MAX_VALUE;

        for (int i = 0; i <= diff; i++) {
            sameCount = Math.min(sameCount, getSameWordCount(a, b, i));
        }
        bw.write(String.valueOf(sameCount));
        bw.flush();
        bw.close();
    }

    private static int getSameWordCount(String[] a, String[] b, int index) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(!a[i].equals(b[i + index])) count++;
        }

        return count;
    }
}
