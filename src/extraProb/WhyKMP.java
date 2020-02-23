package extraProb;

import java.util.ArrayList;
import java.util.Scanner;

public class WhyKMP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        ArrayList<Character> list = new ArrayList<>();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if((65 <= arr[i]) && (arr[i] <= 90)) list.add(arr[i]);
        }

        for(char iter : list) System.out.print(iter);
    }
}
