import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(3);
        book1 = new Book("The Wizard Of Oz", "Frank Baum", "Fantasy");
        book2 = new Book("Birdsong", "Sebastian Faulks", "Romance");
        book3 = new Book( "Jurrasic Park", "Michael Crichton", "Fantasy");
        book4 = new Book("Catcher In The Rye", "J. D. Salinger", "Fiction");
    }

    @Test
    public void hasNoBooksInBookBagAtStart(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        borrower.borrowBook(library, book1);
        assertEquals(1, borrower.countBooks());
        assertEquals(2, library.countNumberOfBooks());
    }
}
