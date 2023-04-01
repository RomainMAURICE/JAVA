import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Library {
    /*private final ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void add(Book book){
        Objects.requireNonNull(book);
        books.add(book);
    }

    public Book findByTitle(String title){
        for(Book book : books){
            if(book.title().equals(title)){
                return book;
            }
        }
        return null;
    }*/

    private Map<String, Book> books = new LinkedHashMap<>();

    public Library(){
        books = new LinkedHashMap<>();
    }

    public void add(String key, Book book){
        books.put(key, book);
    }

    public Book findByTitle(String key){
        return books.get(key);
    }

    public void removeAllBooksFromAuthor(String nomAuthor){
        for(Book book : books.values()){
            if(book.author().equals(nomAuthor)){
                books.remove(book.title());
            }
        }
    }

    public void removeAllBooksFromAuthor2(String nomAuthor) {
        Iterator<Book> iterator = books.values().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.author().equals(nomAuthor)) {
                iterator.remove();
            }
        }
    }

    public void removeAllBooksFromAuthor3(String nomAuthor) {
        books.values().removeIf(book -> book.author().equals(nomAuthor));
    }


    @Override
    /*public String toString() {
        var builder = new StringBuilder();
        var separator="";
        for(Book i : books){
            builder.append(i);
            builder.append(separator);
            separator="\n";
        }
        return builder.toString();
    }*/
    public String toString(){
        var builder = new StringBuilder();
        for(Book book : books.values()){
            builder.append(book);
            builder.append("\n");
        }
        return builder.toString();
    }
}