package algorithm.class04_Sort;

import java.nio.channels.Pipe;
import java.util.*;

public class Prob08_CoordinationSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            points[i] = new Point(x, y);
        }
        Arrays.sort(points);

        for (int i = 0; i < n; i++) {
            System.out.println(points[i].x + " " + points[i].y);
        }
    }
}

class Point implements Comparable<Point>{
    Integer x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o){
        if(this.x > o.x) return 1;
        else if(this.x.equals(o.x)) {
            if(this.y > o.y) return 1;
            else if(this.y.equals(o.y)) return 0;
            else return -1;
        }else return -1;
    }
}


