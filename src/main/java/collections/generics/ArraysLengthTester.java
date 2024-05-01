package collections.generics;

public class ArraysLengthTester <T1,T2> { //T1,T2 are two data types

        //method takes two array type parameters of type T1,T2
        public String lengthTester(T1[] arr1,T2[] arr2) {
            return (arr1.length==arr2.length?"Equal":"Not Equal");
        }
        public static void main(String[] args) {
            String[] sarr = {"A","B","C"};
            Integer[] numarr1 = {1,2,3,4};
            Integer[] numarr2 = {4,5,6,7};

            ArraysLengthTester<String,Integer> tester1 = new
                    ArraysLengthTester<String,Integer>();
            System.out.println(tester1.lengthTester(sarr, numarr1));

            ArraysLengthTester<Integer,Integer> tester2 = new
                    ArraysLengthTester<Integer,Integer>();
            System.out.println(tester2.lengthTester(numarr1, numarr2));

        }
    }


