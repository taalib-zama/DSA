package lambdaExpressions.GFG;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class GFG {
    static void printCond(Collection<Integer> c,Predicate<Integer> p)
    {
        // Traverse the Collection Print only those elements which pass the test
        for (Integer x: c)
            if(p.test(x))
                System.out.print(x + " ");
    }
    public static void main(String args[])
    {
        // This class implements Predicate Interface
        class MyPredicateEven implements Predicate<Integer>
        {
            // The only abstract method to return when the integer is even
            public boolean test(Integer x)
            {
                return(x%2 == 0);
            }
        }
        // ArrayList to check the function.
        List<Integer> al
                = new ArrayList<>(
                Arrays.asList(
                        10, 5, 20, 7, 30));
        // Passing the collection ArrayList and an object of MyPredicateEven class Since the class MyPredicateEven implements
        // Predicate interface it can be passed as an object to be assigned to a variable p of Predicate type
        printCond(al, new MyPredicateEven());
    }


}
