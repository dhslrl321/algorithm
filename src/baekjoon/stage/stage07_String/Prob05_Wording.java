package baekjoon.stage.stage07_String;

import java.util.Scanner;

public class Prob05_Wording {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] count = new int[91]; // ASCII

        String str = input.next();
        str = str.toUpperCase();
        int max = 0;
        int result = 0;
        String[] strArr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            strArr[i] = String.valueOf(str.charAt(i));
        }

        for (int i = 0; i < count.length; i++) {
            if (!(count[i] == 0)) {
                if(max < count[i]){
                    max = count[i];
                    result = i;
                }else if(max == count[i]){
                    result = 63;
                }
            }
        }
        char ans = (char) result;
        System.out.println(ans);
    }
}
