package oops.prentChildRef;

import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class tester {
    public static void main(String[] args) {
//        Base b = new Base();
//        Derived d = (Derived)b;
//        b.show();
//        List l = new Vector<>();
//        List vaa = new HashSet<>();

        String s1 = "ABC";
        String s2 =  "ABC";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
