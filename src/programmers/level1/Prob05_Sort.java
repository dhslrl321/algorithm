package programmers.level1;

import java.util.*;

public class Prob05_Sort {
    public static void main(String[] args) {
        String[] strings = {"aaa", "aaaaa", "aa"};
        int n = 1;

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n) > o2.charAt(n)){
                    return 1;
                }else if (o1.charAt(n) == o2.charAt(n)){
                    return o1.compareTo(o2);
                }else return -1;
            }
        });

        System.out.println(Arrays.toString(strings));

    }
}
