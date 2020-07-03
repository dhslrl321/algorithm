package baekjoon.stage.stage07_String;

import java.util.Scanner;

public class Prob03_FindAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        System.out.println(s);

        for(int i=97; i<123; i++){
            System.out.print(s.indexOf(i)+" ");
        }

    }
}
