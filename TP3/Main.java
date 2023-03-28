public class Main {
    public static void main(String[] args) {
        var book = new Book("Da Vinci Code", "Dan Brown");
        System.out.println(book.title() + " " + book.author());
              
        String nouveauTitre = "Inferno";
        book = book.withTitle(nouveauTitre);



        var b1 = new Book("Da Java Code", "Duke Brown");
        var b2 = b1;
        var b3 = new Book("Da Java Code", "Duke Brown");
    
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));

        var book1 = new Book("Da Vinci Code", "Dan Brown");
        var book2 = new Book("Angels & Demons", new String("Dan Brown"));

        System.out.println(book1.isFromTheSameAuthor(book1, book2));



        var javaBook = new Book("Da Java Code", "Duke Brown");
        System.out.println(javaBook);

        int[] t = {6,8,3,4,0};
        Ex4.swap(t, 1, 2);
        System.out.print(t[0]);
        System.out.print(t[1]);
        System.out.print(t[2]);
        System.out.print(t[3]);
        System.out.println(t[4]);

        System.out.println(Ex4.indexOfMin2(t, 0, 5));

        Ex4.sortW(t);
        System.out.print(t[0]);
        System.out.print(t[1]);
        System.out.print(t[2]);
        System.out.print(t[3]);
        System.out.print(t[4]);
    }
}