package StringQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class Solutions {
        public static void main(String[] args) {
            //sample string
            String str = "THis is a     sentence.";


            String[] arr = str.split("\\s+"); // Split the string into words, handling multiple spaces
            for (String word : arr) {
                System.out.println(word);
            }

      /* String[] arr2 = str.split(" ");
       for(String word2 : arr2){
           System.out.println(word2);
       }*/


            /*String reversed = String.join(" ", str.strip().split("\\s+")); // Join the words back into a string with spaces
             */

            String reversed = Arrays.stream(str.split(" "))
                    .reduce((word1, word2) -> word2 + " " + word1)
                    .orElse("");

            //it creates a new string every map operation
            // use a array and reverse it.
            String reversed2 = Arrays.stream((str.split("\\s+ "))).     //\\s+ → one or more whitespace followed bya literal space
                    collect(Collectors.collectingAndThen(Collectors.toList(),   // 2 step collector -> 1 Applies a final transformation after the list is created and collects its to a list
                    list -> {
                        Collections.reverse(list);      //Reverses the list in place
                        return String.join(" ", list);    //Joins the reversed list into a single string
                    }));

            System.out.println("Reversal using array reversal " + reversed2);


            // Single StringBuilder, no intermediate objects
            //StringBuilder sb = new StringBuilder(str.strip());
            String singleLine  = "name";
            String reversed3 = new StringBuilder(str.strip()).reverse().toString();  // full char reversal


            System.out.println("Reversal using stringbuilder : "+ reversed3);

      /* String reversed = Arrays.stream(new String[]{str.strip()})
               .filter(word -> !word.isEmpty()) // Filter out empty strings
               .reduce((word1, word2) -> word2 + " " + word1) // Reverse the order of words
               .orElse(""); // Handle the case when the input string is empty
*/
            System.out.println(reversed);



            //COUNT number of vowels in a string.
            String example = "Acknowledge";
            List<Character> vowels = example.chars()    //chars() returns an IntStream,
                    .mapToObj(c -> (char) c)    //Converts the IntStream into a Stream<Character>, You can’t use filter with character logic
                    .filter(c -> "AEIOUaeiou".indexOf(c) != -1)   //Filters the stream to keep only vowels
                    .toList();

            long vowelsCount = example.chars()
                    .mapToObj(c -> (char) c)
                    .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
                    .count();

            System.out.println("String has " + vowelsCount + " vowels. They are : " + vowels);
            //first non repeating char in string.
            String test4 = "Abracadabra";
            Character firstNonRepeating = test4.toLowerCase().chars()
                    .mapToObj(c -> (char) c)
                    .filter(c -> test4.indexOf(c) == test4.lastIndexOf(c))
                    .findFirst()
                    .orElse(null);

            System.out.println("First non-repeating character: " + firstNonRepeating);


            //find longest stream in a list.
            List<String> words = Arrays.asList("Java", "Python", "JavaScript", "C++");
            Optional<String> longestString  = words.stream().reduce((word1, word2) -> word1.length() >= word2.length() ? word1 : word2);
            longestString.ifPresent(s -> System.out.println("Longest string: " + s));


            //concatenate a list of strings into a single string with a delimiter.
            List<String> stringList = Arrays.asList("Hello", "World", "Java");
            String concatenated = String.join(" ", stringList); // Joining the strings with a comma and space as a delimiter
            System.out.println("Concatenated string:    " + concatenated);


            //group strings by their length using stream :
            List<String> words9 = Arrays.asList("a", "bb", "cc", "ddd", "eee");
            Map<Integer, List<String>> groupedByLength =words.stream()
                    .collect(Collectors.groupingBy(String::length));



            //  How to check if a string is a palindrome using streams?
            String input = "madam";
            boolean isPalindrome = input.equals(new StringBuilder(input).reverse().toString());
            System.out.println("Is the string a palindrome? " + isPalindrome);

            //count occurrences of each character in string
            String str0 = "filtered";
            Map<Character, Long> characterCount = str0.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));



            //find the character occurring exactly twice
            String str45 = "filtered";
            Optional<Character> result = str45.chars().mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry -> entry.getValue() == 2)
                    .map(Map.Entry::getKey)
                    .findFirst();

            //find the anagrams of a string.







        }

    }
