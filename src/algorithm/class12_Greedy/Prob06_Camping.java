package algorithm.class12_Greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prob06_Camping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, p, v;

        List<Integer> list = new ArrayList<>();
        while(true){
            l = sc.nextInt();
            p = sc.nextInt();
            v = sc.nextInt();
            if(l == 0 && p == 0 && v == 0) break;

            int count = 0;
            count += (v / p) * l;
            int rest = v % p;
            if(rest > l) {
                count += l;
            }else {
                count += rest;
            }
            list.add(count);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Case " + (i+1) + ": " + list.get(i));
        }
    }
}
