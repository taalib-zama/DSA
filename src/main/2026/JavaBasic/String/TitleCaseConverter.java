package JavaBasic.String;

public class TitleCaseConverter {
    //capitalize the name title.
    //split → transform → join pipeline
    public static void main(String[] args) {
        String rawInput = "java standard edition";

        // 1. Split
        String[] words = rawInput.split(" ");

        // 2. Transform
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstChar = Character.toUpperCase(word.charAt(0));
            String rest = word.substring(1);

            words[i] = firstChar + rest;
            System.out.println("The word being processed is : " + words[i]);
        }

        // 3. Join
        String formatted = String.join(" ", words);

        System.out.println("Result: " + formatted);
    }
}
