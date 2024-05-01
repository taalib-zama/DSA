package collections.maps.mapIteration;

public class Book {
    private Integer bookId;
    private String bookName;
    private String genre;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book(Integer bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
}
