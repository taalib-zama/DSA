package snippets;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Integer a = 3;
        Integer arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
        if( Arrays.asList(arr).contains(a)){
            System.out.println("ok");
        }else {
            System.out.println("Mo");
        }
    }
}
