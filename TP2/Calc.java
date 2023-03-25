import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valueInt=0;
        int valueInt2=0;

        boolean notANumber = true;
        while(notANumber){
            String value = scanner.nextLine();
            String value2 = scanner.nextLine();
            if(value.matches("-?\\d+")){
                if(value2.matches("-?\\d+")){
                    valueInt = Integer.parseInt(value);
                    valueInt2 = Integer.parseInt(value2);
                    notANumber=false;
                }
                else{
                    System.out.println("Veuillez entrer des nombres");
                }
            }
            else{
                System.out.println("Veuillez entrer des nombres");
            }
        }

        scanner.close();
        System.out.println(valueInt+valueInt2);
        System.out.println(valueInt-valueInt2);
        System.out.println(valueInt*valueInt2);
        System.out.println(valueInt/valueInt2);
        System.out.println(valueInt%valueInt2);
    }
}