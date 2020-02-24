package extraProb;

import java.util.Scanner;

public class NumOfAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();

        int[] res = new int[26];

        for (int i = 0; i < s.length(); i++) res[s.charAt(i) - 'a']++;
        for (int iter : res) System.out.print(iter+" ");
    }
}
