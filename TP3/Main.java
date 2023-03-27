public class Main {
    public static void main(String[] args) {
        var book = new Book("Da Vinci Code", "Dan Brown");
        System.out.println(book.title() + ' ' + book.author());  
              
        String nouveauTitre = "Inferno";
        book = book.withTitle(nouveauTitre);
    }
}