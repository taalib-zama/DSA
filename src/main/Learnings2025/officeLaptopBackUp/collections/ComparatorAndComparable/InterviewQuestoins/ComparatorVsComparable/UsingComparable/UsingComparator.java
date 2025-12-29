package collections.ComparatorAndComparable.InterviewQuestoins.ComparatorVsComparable.UsingComparable;

import java.util.Arrays;
import java.util.Comparator;

public class UsingComparator {
    public static void main(String[] args) {
        //soritng using comparator using lambda exp
        // Create some Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        // Create an array of books
        Book[] books = {book1, book2, book3};

        // Print the books before sorting
        System.out.println("Books before sorting: " + java.util.Arrays.toString(books));

        // Sort the books using the compareTo method
        // The compareTo method is called implicitly when sorting the array
        // This will sort the books by title
        java.util.Arrays.sort(books, (b1, b2) -> b1.title.compareTo(b2.title));


        //or
        // Sort the books using Comparator.comparing
        Arrays.sort(books, Comparator.comparing(book -> book.title));


        //or
        Comparator<Book> titleComparator = new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.title.compareTo(b2.title);
            }
        };
        Comparator<Book> authorComparator = new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.author.compareTo(b2.author);
            }
        };
        //sort the books by title first, then by author
        Arrays.sort(books, titleComparator.thenComparing(authorComparator));



        // Print the books after sorting
        System.out.println("Books after sorting: " + java.util.Arrays.toString(books));
    }
}
