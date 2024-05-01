package java8.lambda.lamdaParametres;

import java8.lambda.Test2;

public class GfG {
    // functional interface parameter is passed
    //static void fun(Test1 t) { t.print(); }



    public static void main(String[] args)
    {
        // lambda expression is passed
        // without parameter to functional interface t
        //fun(() -> System.out.println("Hello"));

        Test1 test1 = () ->{
            System.out.println("test");
        };

        test1.print();


       // Test2 test2 = (int x) -> {

    }


}
