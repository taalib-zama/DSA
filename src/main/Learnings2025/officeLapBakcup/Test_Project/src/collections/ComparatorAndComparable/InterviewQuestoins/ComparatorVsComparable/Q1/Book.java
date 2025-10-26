package collections.ComparatorAndComparable.InterviewQuestoins.ComparatorVsComparable.Q1;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public int compareTo(Book other) {
        // Compare by year first, then by title if years are equal
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        } else {
            return this.title.compareTo(other.title);
        }
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }
}
