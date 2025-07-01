package Reflections;

import java.util.Arrays;

public class TestingReflections {
    public static void main(String[] args) {
        Class eagleClass = Eagle.class;
        System.out.println(Arrays.toString(eagleClass.getClasses()));
        System.out.println(Arrays.toString(eagleClass.getDeclaredFields()));
        System.out.println(Arrays.toString(eagleClass.getDeclaredMethods()));
    }
}
