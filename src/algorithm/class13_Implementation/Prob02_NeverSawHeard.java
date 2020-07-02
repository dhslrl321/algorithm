package algorithm.class13_Implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Prob02_NeverSawHeard {
    /*
    * 1. 듣지 못한놈을 hashMap 에 넣고 value 를 0으로 setting
    * 2. 보지 못한놈의 값을 듣지 못한 놈의 hashMap.contain(key)로 찾고 있으면 value 를 1로 setting
    * 3. 듣지 못한 놈의 value 중에 1인 key 만 list 로 반환*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        String[] heard = new String[n];
        String[] saw = new String[n];

        for(int i = 0; i < heard.length + saw.length; i++){

        }
    }

    /* 1. 듣지 못한놈을 hashMap 에 넣고 value 를 0으로 setting */
    public HashMap<String, Boolean> neverHeard(String[] names){
        return null;
    }

    /*2. 보지 못한놈의 값을 듣지 못한 놈의 hashMap.contain(key)로 찾고 있으면 value 를 1로 setting  */
    public List<String> neverSaw(HashMap<String, Boolean> heard, String[] names){
        return null;
    }


}
