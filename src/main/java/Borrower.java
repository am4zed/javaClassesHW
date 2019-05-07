import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bookBag;


    public Borrower(){
        this.bookBag = new ArrayList<>();
    }


    public int countBooks() {
        return bookBag.size();
    }

    public void borrowBook(Library library, Book book) {
        library.removeBook(book);
        bookBag.add(book);
    }
}
