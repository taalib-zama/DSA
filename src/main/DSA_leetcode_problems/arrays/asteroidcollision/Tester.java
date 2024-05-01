package arrays.asteroidcollision;

public class Tester {
    public static void main(String[] args) {
        int[][] arr = {{5,10,-5},{8,-8},{10,2,-5}};
        for(int[] a:arr)
        System.out.println(Solution.asteroidCollision(a));
    }
}
