package Library;

public class Book extends LibraryItem {private String author;

    public Book(String title, int identifier, String author) {
        super(title, identifier);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + getTitle() + " by " + author;
}}
