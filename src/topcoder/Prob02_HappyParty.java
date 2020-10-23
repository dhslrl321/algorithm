package topcoder;

import java.util.HashMap;
import java.util.Scanner;

public class Prob02_HappyParty {
    public static void main(String[] args) {
        String[] arr1 = {"fishing", "fishing", "parking", "sounding"};
        String[] arr2 = {"hunting", "hunting", "hunting", "fishing"};

        HashMap<String, Integer> map = new HashMap<>();

        map.put("jang", 24);
        map.put("heo", 25);
        map.put("park", 25);
        map.put("choi", 21);

        System.out.println(map.get("jang") + 1);
        //System.out.println("return: " + solution(arr1, arr2));
    }

    private static int solution(String[] arr1, String[] arr2){
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr1.length ; i++) {
            map.put(arr1[i], map.get(arr1[i]) + 1);
        }
        return 10;
    }
}
