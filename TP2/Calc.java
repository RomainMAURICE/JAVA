import java.util.Scanner; 

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String value2 = scanner.nextLine();
        scanner.close();
        System.out.println(value+value2);
        System.out.println(value-value2);
        System.out.println(value*value2);
        System.out.println(value/value2);
        System.out.println(value%value2);
    }
}