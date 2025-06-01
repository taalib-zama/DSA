package oops.objectVsReferentialEquality;

public class Sample {
    public static void main(String[] args) {

        //The equality of objects generally compares whether the contents stored in memory are equal.
        // Reference equality generally compares whether the memory addresses they point to are equal.
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = str1;
        // ==the operator compares string reference equality.

        System.out.println(str1.hashCode()+ "and"+ str2.hashCode());
        System.out.println(str1.hashCode()+ "and"+ str3.hashCode());
        System.out.println(str1.hashCode()+ "and"+ str4.hashCode());
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        //  equals compares string object equality. (contents)
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

    }
}
