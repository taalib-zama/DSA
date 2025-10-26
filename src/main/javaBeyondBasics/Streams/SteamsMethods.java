package javaBeyondBasics.Streams;

import java.util.ArrayList;
import java.util.List;

public class SteamsMethods {
    //1. forEach() : This method is used to traverse each element of the stream.
    // It is used mainly to display the elements in a Stream. For example:
    public static void main(String[] args) {
        List<String> placesToVisit= new ArrayList<>();
        placesToVisit.add("Chicago");
        placesToVisit.add("Venice");
        placesToVisit.add("Tokyo");
        placesToVisit.add("San Francisco");
        placesToVisit.add("Kyoto");
        placesToVisit.add("Abu Dhabi");
        placesToVisit.stream().forEach(place -> System.out.println("Trip to " + place));



        // 2. map() :  This method is used to return a new stream based on operations done on an existing stream.
        placesToVisit.stream().map(place -> place.toUpperCase()).forEach(place -> System.out.println(place));
    }

}
