package collections.comparableImplementation.sortUsingComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/*void sort​(Comparator<? super E> c): This method sorts elements in the given list according to the order mentioned
by a Comparator. This method belongs to interface List and takes an implementation of the Comparator interface for the
customized sorting of the list.
 */


/*Hence, by this method we can sort a list not only on the basis of natural order, but also by our own custom format for
 sorting.

Comparator is a Built-In Functional Interface, which is used in ordering a given collection. It orders the collection
using the implementation provided for its compare().

We have been given the list of employeeNames, which we have to sort based on the natural ordering and based on the length
 of each element. Execute the code given below and observe the output.
 */
public class Tester {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Rachael","Ross","Monica",
                "Chandler","Joey","Phoebe");

        //Displaying employeeNames before sorting
        System.out.println(employeeNames);

        // list.sort() takes the implementation of Comparator interface for inducing the ordering
        Comparator<String> compare1 = new SortImplementationOne();
        employeeNames.sort(compare1);

        //Displaying employeeNames after sorting based on natural ordering
        System.out.println(employeeNames);

        // list.sort() takes another implementation of Comparator interface for inducing the ordering
        Comparator<String> compare2 = new SortImplementationTwo();
        employeeNames.sort(compare2);

        //Displaying employeeNames after sorting based on length of each element
        System.out.println(employeeNames);
    }

}
