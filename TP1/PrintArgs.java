/*public class PrintArgs {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}*/

/*public class PrintArgs {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}*/

public class PrintArgs {
    public static void main(String[] args) {
        for(String i : args){
            System.out.println(i);
        }
    }
}