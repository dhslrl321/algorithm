package solved.impl;

import java.io.BufferedReader;

// Edge Case 에 대한 생각이 없었다.
public class B1316 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int answer = 0;

        for (int i = 0; i < n; i ++) {
            String word = br.readLine();

            if (checkGroupLetter(word)) {
                answer++;
            }
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }

    private static boolean checkGroupLetter(String word) {
        boolean[] check = new boolean[23];
        String[] letters = word.split("");

        int zeroIndex = letters[0].charAt() - 'a';
        check[zeroIndex] = true;

        for (int i = 1; i < letters.length; i++) {
            int index = letters[i].charAt() - 'a';
            
            if (letters[i-1].equals(letters[i])) continue;

            if (check[index]) {
                return false;
            }
            check[index] = true;
        }

        return true;
    }
}
