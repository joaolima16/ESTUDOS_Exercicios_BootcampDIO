package Collections.Entities;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", yearPublished=" + yearPublished + "]";
    }
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}
