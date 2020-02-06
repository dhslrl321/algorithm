package stage07_String;

import java.util.Scanner;

public class Prob08_Dial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next().toUpperCase();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case (65 | 66 | 67): {
                    sum += 3;
                    break;
                }
                case (68 | 69 | 70): {
                    sum += 4;
                    break;
                }
                case (71 | 72 | 73): {
                    sum += 5;
                    break;
                }
                case (74 | 75 | 76): {
                    sum += 6;
                    break;
                }
            }
        }
    }
}
