package stage.stage07_String;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob10_GroupWordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Using using = new Using();
        int strNum = input.nextInt();

        int ans = 0;

        for (int i = 0; i < strNum; i++) {
            String str = input.next();
            ans += using.checker(str);
        }
        System.out.println(ans);
        
    }
}

class Using {

    public int checker(String str){

        char[] arr = str.toCharArray();

        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            try {
                if(arr[i] != arr[i+1]) arrayList.add(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                arrayList.add(str.charAt(str.length()-1));
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i; j < arrayList.size(); j++) {
                if(i != j && arrayList.get(i) == arrayList.get(j)) return 0;
            }
        }
        return 1;
    }
}
