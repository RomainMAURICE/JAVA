import java.util.Scanner;

/*public class Calc {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int value;
        value = scanner.nextInt();
        System.out.println(value);
    }
}*/

/*public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value);
    }
}*/

//nextInt() n'est pas une fonction car
//nextInt() est une méthode

//import java.util.Scanner permet d'importer dans notre code une bibliothèque extérieur pour pouvoir utiliser ses méthodes

/*public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int value2 = scanner2.nextInt();
        System.out.println(value+value2);
    }
}*/

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int value2 = scanner.nextInt();
        scanner.close();
        System.out.println(value+value2);
        System.out.println(value-value2);
        System.out.println(value*value2);
        System.out.println(value/value2);
        System.out.println(value%value2);
    }
}