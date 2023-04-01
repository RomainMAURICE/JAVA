import javax.swing.plaf.BorderUIResource.LineBorderUIResource;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Book book1 = new Book("harry potter", "JKR");
        Book book2 = new Book("Labyrinthe", "James Dasher");
        Book book3 = new Book("Labyrinthe2", "James Dasher");
        Book book4 = new Book("oui", "non");


        library.add(book1.title(), book1);
        library.add(book2.title(), book2);
        library.add(book3.title(), book3);
        library.add(book4.title(), book4);


        System.out.println(library.toString());

        library.removeAllBooksFromAuthor3("JKR");

        System.out.println(library.toString());
    }
}
