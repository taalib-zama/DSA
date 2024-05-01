package collections.generics.EqualityTester;

public class Tester {
    public static void main(String [] args){
        EqualityTester<String,String> obj = new EqualityTester<String,String>("Str","Str");
        System.out.println(obj.checkEquals());

        //try with different inputs and observe the results
        String [] str1 = {"AA","BB","CC","DD"};
        Integer [] int1 = {1,2,3,4,5};
        EqualityTester<String,Integer> obj2 = new EqualityTester<String,Integer>();
        System.out.println(obj2.checkEquals(str1,int1));

        //Array length tester.
        Integer[] int2 = new Integer[4];
        EqualityTester<String,Integer> obj3 = new EqualityTester<String,Integer>();
        System.out.println(obj3.arrayLengthTest(str1, int2));


    }
}
