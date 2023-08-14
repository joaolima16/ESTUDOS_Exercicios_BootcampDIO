package Collections.PesquisaList;

import java.util.ArrayList;
import java.util.List;

import Collections.Entities.Book;

public class ListBooks {
    private List<Book> lsBooks;

    public ListBooks() {
        this.lsBooks = new ArrayList<>();
    }

    public void addBook(String title, String author, int yearPublished) {
        this.lsBooks.add(new Book(title, author, yearPublished));
    }

    public List<Book> findByAuthorList(String author) {
        List<Book> booksForAuthorList = new ArrayList();
        if (!lsBooks.isEmpty()) {
            for (Book b : lsBooks) {
                if (b.getAuthor().equalsIgnoreCase(author)) {
                    booksForAuthorList.add(b);
                }
            }
        }
        return booksForAuthorList;
    }

    public List<Book> listBooksbyGapBooks(int initYear, int finishYear) {
        List<Book> booksByGap = new ArrayList();
        if (!lsBooks.isEmpty()) {
            for (Book b : lsBooks) {
                if (b.getYearPublished() >= initYear && b.getYearPublished() <= finishYear) {
                    booksByGap.add(b);
                }
            }
        }
        return booksByGap;
    }
    public Book  findbyAuthor(String author){
        Book bookForAuthor = null;
        if(!lsBooks.isEmpty()){
            for(Book b: lsBooks){
                if(b.getTitle().equalsIgnoreCase(author)){
                    bookForAuthor = b;
                }
            }
        }
        return bookForAuthor;
    }
}
