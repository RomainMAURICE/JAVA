import java.util.Objects;

/*public record Book(String title, String author) {

}*/

/*public record Book(String title, String author) {
    public static void main(String[] args) {
        var book = new Book("Da Vinci Code", "Dan Brown");
        System.out.println(book.title() + ' ' + book.author()); 
    }
}*/

/*public record Book(String title, String author) {
    public Book(String title, String author){
        Objects.requireNonNull(title, "title is null");
        this.title = title;
        this.author = author;
    }
}*/

/*public record Book(String title, String author) {
    public Book{
        Objects.requireNonNull(title, "title is null");
    }
}*/

/*public record Book(String title, String author) {

    public Book(String title, String author){
        Objects.requireNonNull(title, "title is null");
        this.title = title;
        this.author = "<no author>";
    }
    public Book(String title){
        this(title, "<no author>");
    }    
}*/

public record Book(String title, String author) {

    public Book{
        Objects.requireNonNull(title, "title is null");
    }
    public Book(String title){
        this(title, "<no author>");
    }

    public Book withTitle(String title) {
        return new Book(title, this.author);
    }    

    public boolean isFromTheSameAuthor(Book book1, Book book2){
        return book1.author.equals(book2.author);
    }

}

