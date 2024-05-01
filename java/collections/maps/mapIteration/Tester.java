package collections.maps.mapIteration;

import java.util.*;
import java.util.Map.Entry;

public class Tester {
    public static void main(String[] args) {
        //creating a map object based on two classes Author and Book.
        //books
        Book book1 = new Book(1, "Harry Potter and the Philosopher's Stone");
        Book book2 = new Book(2, "A Game of Thrones");
        Book book3 = new Book(3, "A Clash of Kings");
        //authors
        Author author1 = new Author(1, "J K Rowling");
        Author author2 = new Author(2, "George R R Martin");

        //mapping books and authors.
        Map<Book, Author> bookAuthorMap = new HashMap<>();
        bookAuthorMap.put(book1, author1);
        bookAuthorMap.put(book2, author2);
        bookAuthorMap.put(book3, author2);

        //Iterating over value column of the Map using map.values()
        Collection<Author> authorsList = bookAuthorMap.values();
        System.out.println("The different authors are: ");
        for (Author author : authorsList) {
            System.out.println(author.authorName);
        }
        System.out.println();

        //Iterating over key column of the Map using map.keySet()
        Set<Book> booksSet = bookAuthorMap.keySet();
        System.out.println("The different books with their respective authors are (using KeySet):");
        for (Book book : booksSet) {
            Author author = bookAuthorMap.get(book);
            System.out.println(book.getBookName()+": "+author.authorName);
        }
        System.out.println();

        //Iterating over key and value of the Map using Set<Entry>
        Set<Entry<Book, Author>> bookAuthorEntries = bookAuthorMap.entrySet();
        System.out.println("The different books with their respective authors are (using EntrySet):");
        for (Entry<Book, Author> bookAuthorEntry : bookAuthorEntries) {
            Book book = bookAuthorEntry.getKey();
            Author author = bookAuthorEntry.getValue();
            System.out.println(book.getBookName()+": "+author.authorName);
        }

        System.out.println("*****************************************************");
        //Filtering books based on genre and populating a list of such books
        List<FantasyBook> fantasyBooksList = new ArrayList<FantasyBook>();
        Iterator<Entry<Book, Author>> bookAuthorEntryIterator = bookAuthorEntries.iterator();
        while(bookAuthorEntryIterator.hasNext()) {
            Entry<Book, Author> bookAuthorEntry = bookAuthorEntryIterator.next();
            Book book = bookAuthorEntry.getKey();
            Author author = bookAuthorEntry.getValue();

            if(book.getGenre().toLowerCase().contains("fantasy")){
                FantasyBook fantasyBook = new FantasyBook();
                fantasyBook.setBookName(book.getBookName());
                fantasyBook.setGenre(book.getGenre());
                fantasyBook.setAuthorName(author.getAuthorName());
                fantasyBooksList.add(fantasyBook);
            }
        }
    }
}
