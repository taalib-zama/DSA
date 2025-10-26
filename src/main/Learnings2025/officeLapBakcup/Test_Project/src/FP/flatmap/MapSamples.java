package FP.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapSamples {

    public static void main(String[] args) {
        //testing differnece between map and flatmap.
        //map is used to transform one object to another object.
        //flatmap is used to transform one object to another object and flatten it.
        List<String> sentences = Arrays.asList("Hello world", "Java programming", "flatMap example");
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());

        System.out.println(words);  // Output: [Hello, world, Java, programming, flatMap, example]

    }
}
