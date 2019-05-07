import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Library {
//    private ArrayList<Book> books;
    private HashMap<String, Integer> books;
    private int capacity;

    public Library(int capacity){
        this.books = new HashMap();
        this.capacity = capacity;
    }

    public int countNumberOfBooks() {
        Collection<Integer> genreValues = books.values();
        int totalBooks = 0;
        for (int num : genreValues) {
            totalBooks += num;
        }
        return totalBooks;
    }

    public void addBook(Book book) {
        if (checkIfCapacityLeft()){
            if (books.containsKey(book.genre)) {
// add 1 to key's value
            }
            books.put(book.genre, 1);
//            add book to HashMap with genre as key and 1 as value
        }
    }

    public boolean checkIfCapacityLeft(){
        return (countNumberOfBooks() < capacity);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
}
