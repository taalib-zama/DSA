package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsCreation {
    public static void main(String[] args) {
        //A Stream represents a sequence of elements from a source and supports various data processing operations.
        //provides an abstraction over an existing collection
        //Streams also provide the support to parallel threading of the code, which breaks the bigger problem into
        // smaller chunks.
        // These smaller problems are solved separately and their solutions are combined together to obtain the final
        // solution.

        //1. Stream from collection using Stream()
        List<String> castList = List.of("Sam","Dean","Castiel","Crowley");
        Stream<String> supernatural = castList.stream();

        //2. Stream from Array using Streams():
        Integer[] array = {672, 340, 999};
        Stream<Integer> stream = Arrays.stream(array);

        //3.creating a stream directly using of() method.
        Stream<Integer> stream2 = Stream.of(672, 340, 999);
        Stream<String>  stream3  = Stream.of("T", "a", "a");

        //4. creating stream of objects of user defined classes.
        Stream<EmployeeClassSample> empStream = Stream.of( new EmployeeClassSample("Tom",5699.5),
                new EmployeeClassSample("Jack",7629.2),new EmployeeClassSample("Jane",5289.8));

        //5.



    }
}
