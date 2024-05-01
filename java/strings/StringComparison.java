package strings;

public class StringComparison {
    public static void main(String[] args) {
            String a = "ABC";
            String a1 = "ABC";
            String b = "XYZ";
            String c = new String("PQR");  // cretes explicitly new string object and stores in heap memory apart from String pool
            String d = new String("PQR");
            String e = a;

            //== operator  - checks for reference variables are pointing to same object or not
        System.out.println(a==a1);
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(a==e);

            // .equals() method - it doesn't care weather the ref variables are pointing to same object or not. it just compares the values.
        System.out.println(c.equals(d));
        System.out.println(a.equals(a1));



    }
}
