package baekjoon.ps3sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Prob01_SortCoordinate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            String[] xy = br.readLine().split(" ");
            points[i] = new Point(
                    Integer.parseInt(xy[0]),
                    Integer.parseInt(xy[1]));
        }

        Comparator<Point> myComparator = new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if(p1.x > p2.x) {
                    return 1;
                }else if (p1.x == p2.x){
                    if(p1.y > p2.y) {
                        return 1;
                    }else return -1;
                }
                return -1;
            }
        };

        Arrays.sort(points, myComparator);

        for (int i = 0; i < n; i++) {
            bw.write(points[i].x + " " + points[i].y + "\n");
        }
        bw.flush();
        bw.close();
    }
}

class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
