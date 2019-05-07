import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("The Wizard Of Oz", "Frank Baum", "Fantasy");
        book2 = new Book("Birdsong", "Sebastian Faulks", "Romance");
        book3 = new Book( "Jurrasic Park", "Michael Crichton", "Fantasy");
        book4 = new Book("Catcher In The Rye", "J. D. Salinger", "Fiction");
    }

    @Test
    public void hasNoBooksAtStart(){
        assertEquals(0, library.countNumberOfBooks());
    }

    @Test
    public void capacityLeftCanAddBooks(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.countNumberOfBooks());
    }

    @Test
    public void capacityFullCannotAddBooks(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.countNumberOfBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.removeBook(book1);
        assertEquals(2, library.countNumberOfBooks());
    }




}
