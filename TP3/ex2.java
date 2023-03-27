/*public class ex2 {
    public static void main(String[] args) {
        var b1 = new Book("Da Java Code", "Duke Brown");
        var b2 = b1;
        var b3 = new Book("Da Java Code", "Duke Brown");
    
        System.out.println(b1 == b2);
        System.out.println(b1 == b3);
    }
}*/
//true
//false
//parce que == compare l'adresse des variables, b2 est copié sur l'adresse de b1

public class ex2 {
    public static void main(String[] args) {
        var b1 = new Book("Da Java Code", "Duke Brown");
        var b2 = b1;
        var b3 = new Book("Da Java Code", "Duke Brown");
    
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));

        var book1 = new Book("Da Vinci Code", "Dan Brown");
        var book2 = new Book("Angels & Demons", new String("Dan Brown"));

        System.out.println(book1.isFromTheSameAuthor(book1, book2));

    }
}

