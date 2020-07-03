package baekjoon.classification.class04_Sort;

import java.util.*;

public class Prob10_CoordinationSort2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        MyCoordination[] myCoordination = new MyCoordination[n];

        for(int i=0; i<n; i++){
            int x = input.nextInt();
            int y = input.nextInt();

            myCoordination[i] = new MyCoordination(x, y);
        }

        Arrays.sort(myCoordination);

        for(int i=0; i < n; i++){
            System.out.println(myCoordination[i].x + " " + myCoordination[i].y);
        }
    }
}

class MyCoordination implements Comparable<MyCoordination>{
    int x;
    int y;

    MyCoordination(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(MyCoordination o){
        if(this.y > o.y) return 1;
        else if(this.y == o.y) {
            return this.x - o.x;
        }
        else return -1;
    }

}
