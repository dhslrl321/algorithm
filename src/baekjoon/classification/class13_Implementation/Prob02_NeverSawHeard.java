package baekjoon.classification.class13_Implementation;

import java.util.*;

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
        String[] saw = new String[k];

        for (int i = 0; i < heard.length; i++) {
            heard[i] = input.next();
        }
        for (int i = 0; i < saw.length; i++) {
            saw[i] = input.next();
        }

        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (String name : heard) map.put(name, 0);
        for (String name : saw) {
            if(map.containsKey(name)){
                list.add(name);
            }
        }
        System.out.println(list.size());
        Collections.sort(list);
        for(String name : list) System.out.println(name);
    }




}
