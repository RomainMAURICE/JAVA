public class Morse {
    public static void main(String[] args) {
        for(String i : args){
            System.out.print(i+" Stop. ");
        }
    }
}

/*import java.lang.StringBuilder;

public class Morse {
    public static void main(String[] args) {
        var builder = new StringBuilder();
        for(String i : args){
            builder.append(i);
            builder.append(" Stop. ");
        }
        System.out.println(builder.toString());
    }
}*/