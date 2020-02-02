package stage07_String;

import java.util.Scanner;

public class Prob01_ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String character = input.next();

        int result = character.charAt(0);

        System.out.println(result);

    }
}
