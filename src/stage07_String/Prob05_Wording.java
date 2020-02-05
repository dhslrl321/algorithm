package stage07_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class Prob05_Wording {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] count = new int[122];

        String str = input.next();
        int[] result = new int[str.length()];
        String[] strArr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)] += 1;
        }
        for (int i = 0; i < count.length; i++) {
            if (!(count[i] == 0)) {
                count[i]
            }
        }
    }
}
