package algorithm.class04_Sort;

import java.util.*;

public class Prob08_CoordinationSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Coodination[] coodinations = new Coodination[n];

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            coodinations[i] = new Coodination(x, y);
        }

        Arrays.sort(coodinations);



    }
}

class Coodination implements Comparator<Integer>{
    int x, y;

    Coodination(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compare(Integer o1, Integer o2){
        
        if(o1.x > o2.x ) return -1;
        else if(o1.x == o2.x) {
            if(o1.y > o2.y) return -1;
            else if(o1.y == o2.y) return 0;
            else return 1;
        }else return 1;
    }
}
