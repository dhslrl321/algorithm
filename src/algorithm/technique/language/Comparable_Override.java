package algorithm.technique.language;

import java.util.Arrays;

public class Comparable_Override {
    public static void main(String[] args) {
        Point p1 = new Point(10, 2);
        Point p2 = new Point(0, 2);
        Point p3 = new Point(4, 2);
        Point p4 = new Point(3, 2);
        Point p5 = new Point(5, 2);

        Point[] points = {p1, p2, p3, p4, p5};

        Arrays.sort(points);
        for(Point iter : points) System.out.println(iter.x);
    }
}

class Point implements Comparable<Point>{
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        //if(this.x > o.x) return 1; // x 에 대해서 오름 차순
        // if (this.x > o.x) return -1; // x 에 대해서 내림 차순
        //return this.x - o.x; // 오름 차순
        return o.x - this.x; // 내림 차순
    }
}
