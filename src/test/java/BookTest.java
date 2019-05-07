import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before() {
        book1 = new Book("The Wizard Of Oz", "Frank Baum", "Fantasy");
        book2 = new Book("Birdsong", "Sebastian Faulks", "Romance");
        book3 = new Book("Jurrasic Park", "Michael Crichton", "Fantasy");
        book4 = new Book("Catcher In The Rye", "J. D. Salinger", "Fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("Birdsong", book2.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Frank Baum", book1.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", book3.getGenre());
    }
}
