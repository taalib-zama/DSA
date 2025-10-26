package collections.ComparatorAndComparable.InterviewQuestoins.ComparatorVsComparable.Q1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create some Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1949);

        // Create an array of books
        Book[] books = {book1, book2, book3};
        // Print the books before sorting
        System.out.println("Books before sorting:" + (Arrays.toString(books)));
        // Sort the books using the compareTo method
            //comparing using compareTo method and sort the whole list
            // The compareTo method is called implicitly when sorting the array
            // This will sort the books by year first, then by title if years are equal
            // If you want to sort the books, you can use Arrays.sort(books);
            // Uncomment the line below to sort the books array
            Arrays.sort(books);
            System.out.println("Books after sorting:" + Arrays.toString(books));
            //sorted by year first, then by title if years are equal



    }
}
