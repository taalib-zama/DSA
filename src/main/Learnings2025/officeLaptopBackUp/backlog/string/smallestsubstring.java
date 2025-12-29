package backlog.string;

public class smallestsubstring {
    public static void main(String[] args) {
        String str = "welcometojava";
        //to find the smallest and largest substring lexographically.
        String smallest = "";
        String largest = "";
        int k = 3;
        smallest = str.substring(0, k);
        largest = str.substring(0, k);
        for (int i = 0; i <= str.length() - k; i++) {
            String sub = str.substring(i, i + k);
            if (sub.compareTo(smallest) < 0) {
                smallest = sub;
            }
            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }
        System.out.println(smallest + "\n" + largest);
        System.out.println("Done");
        //the value 0 if the argument string is equal to this string; a value less than 0 if this string is lexicographically less than the string argument; and a value greater than 0 if this string is lexicographically greater than the string argument.

    }
}
