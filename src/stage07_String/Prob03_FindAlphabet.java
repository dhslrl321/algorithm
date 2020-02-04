package stage07_String;

import java.util.Scanner;

public class Prob03_FindAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        for(char i='a'; i<'z'; i++){
            System.out.print(s.indexOf(i)+" ");
        }

    }
}
