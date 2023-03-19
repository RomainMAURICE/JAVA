public class Pascal {

    public static int methodePascal(int nBut, int pBut){

        int tab[];
        tab = new int[nBut+1];

        int n, i;
        tab[0] = 1;

        for(n=1; n<=nBut; n++){
          tab[n] = 1;
 
          for(i=n-1; i>0; i--)
            tab[i] = tab[i-1] + tab[i];
        }
 
        int result=tab[pBut];
        return result;
    }
    
    public static void main(String[] args) {
        print(" Cn, p = %d\n");
        print(methodePascal(30000, 250));

    }
}
