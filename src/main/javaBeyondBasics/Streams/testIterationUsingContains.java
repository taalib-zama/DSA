package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class testIterationUsingContains {
    public static void main(String[] args) {
        //Grouped Titles = [[cars], [speed, spede], [duel, dule, deul]]
        List<List<String>> groupedTitles = List.of(
                List.of("cars"),
                List.of("speed", "spede"),
                List.of("duel", "dule", "deul")
        );

        List<String> result = groupedTitles.stream().filter(g -> g.contains("speed"))
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(result);


        /*Flattening was not required during printing because the forEach(System.out::println) directly
        prints each group (a List<String>) as a whole. The filter operation narrows down the groups
        hat contain the query, and the forEach simply outputs those groups without needing to process
        their individual elements.*/




    }
}
