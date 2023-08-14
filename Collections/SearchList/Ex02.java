package Collections.SearchList;

public class Ex02 {
    public static void main(String[] args) {
        ListBooks lsBooks = new ListBooks();

        lsBooks.addBook("teste1", "Joao", 2015);
        lsBooks.addBook("test331", "Joao1", 2008);
        lsBooks.addBook("512", "Joao2", 2011);
        lsBooks.addBook("diario de um banana", "jose", 2018);
        lsBooks.addBook("percy jackson", "roberto", 2021);
        System.out.println(lsBooks.findByAuthorList("Joao"));
        System.out.println(lsBooks.listBooksbyGapBooks(2015, 2023));
        System.out.println(lsBooks.findByAuthorList("Joao"));
    }
}
