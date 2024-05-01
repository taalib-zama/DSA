package strings.reverseString;

public class Tester {
    public static void main(String[] args) {
        String str = "Geeks";
        System.out.println(Solution.reverseStringUsingStack(str));

        //sample 2 - reverse using in place method.
        String str2 = "new Sample";
        System.out.println(Solution.inPlaceReverse(str2));

        //sample using strinngbuilder inbuild method.
        String str3 = "Sample 3";
        System.out.println(Solution.usingMethod(str3));
    }
}
