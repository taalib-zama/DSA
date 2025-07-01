package Streams.sandbox;

import java.util.List;

public class PlayingWithString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(6));

        List<Character> convertedCharList = str.replace(" ","").chars()
                .distinct()
                .mapToObj(c -> (char) c)
                .toList();
        System.out.println(convertedCharList);
    }
}
