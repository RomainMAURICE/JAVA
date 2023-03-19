//import java.lang.Integer;

/*public class Point {

    public record Coordonnées(int x, int y) {}

    public static void main(String[] args) {    
    }
}*/

//javac Point.java

/*public class Point {

    public record Coordonnées(int x, int y) {}

    public static void main(String[] args) {    
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        System.out.print("x=");
        System.out.print(x);
        System.out.print(", ");
        System.out.print("y=");
        System.out.println(y);
    }
}*/

//une methode static peut être appelé sans créer de nouvel objet

//lorsque l'un des arguments n'est pas un nombre, l'erreur "Exception in thread "main" java.lang.NumberFormatException: For input string: "a" apparait


/*public class Point {
    
    public record coordonnées(int x, int y) {
    }

    public static void main(String[] args) {    
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        System.out.print("x=");
        System.out.print(x);
        System.out.print(", ");
        System.out.print("y=");
        System.out.println(y);

        var coordonnées = new coordonnées(x, y);
        System.out.print(coordonnées);
    }
}*/

// les paramètres sont x et y, le type de retour est double


public class Point {
    
    public record coordonnées(int x, int y) {
        public double Distance(int x, int y){
            return Math.sqrt(x*x+y*y);
        }
    }

    public static void main(String[] args) {    
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        System.out.print("x=");
        System.out.print(x);
        System.out.print(", ");
        System.out.print("y=");
        System.out.println(y);

        var coordonnées = new coordonnées(x, y);
        System.out.println(coordonnées);

        System.out.print("dist = ");
        System.out.print(coordonnées.Distance(x, y));
        
    }
}