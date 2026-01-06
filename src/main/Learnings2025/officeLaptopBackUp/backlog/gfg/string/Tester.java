package backlog.gfg.string;

import java.util.Arrays;

public class Tester {
    
    public static void main(String[] args) {
        //You are given an array points of n coordinates. These coordinates are objects of the class Point and contain x and y. You need to sort the points array by increasing order of x, and if two x are same then sort by increasing order of y.
        Point[] points = new Point[3];
        points[0] = new Point(1, 2);
        points[1] = new Point(3, 4);
        points[2] = new Point(1, 1);
        sortByXThenY(points);
        //interate throught the array of strings 'input' and display it.
        for (Point p : points) {
            System.out.println(p.x + " " + p.y);
        }

    }

    private static void sortByXThenY(Point[] points) {
        //You are given an array points of n coordinates. These coordinates are objects of the class Point and contain x and y. You need to sort the points array by increasing order of x, and if two x are same then sort by increasing order of y.
        Arrays.sort(points, (p1, p2) -> {
            if (p1.x == p2.x) {
                return Integer.compare(p1.y, p2.y);
            } else {
                return Integer.compare(p1.x, p2.x);
            }
        });
        throw new UnsupportedOperationException("Unimplemented method 'sortByXThenY'");
    }
    
}
