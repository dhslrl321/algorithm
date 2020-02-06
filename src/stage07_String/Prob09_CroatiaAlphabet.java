package stage07_String;

import java.util.Scanner;
import java.util.Arrays;
public class Prob09_CroatiaAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.next();

        if(a.contains("c=")){
            System.out.println("있음");
        }else{
            System.out.println("no");
        }

    }
}
