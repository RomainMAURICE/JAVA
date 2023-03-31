import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private final ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void add(Book book){
        Objects.requireNonNull(book);
        books.add(book);
    }

    public Book findByTitle(String title){
        for(Book i : books){
            if(i.title().equals(title)){
                return i;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        var separator="";
        for(Book i : books){
            builder.append(i);
            builder.append(separator);
            separator="\n";
        }
        return builder.toString();
    }
}