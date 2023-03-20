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
        System.out.print(" Cn, p = ");
        System.out.print(methodePascal(30000, 250));

    }
}

//time real 0m0,194s
//user 0m0,177s
//sys 0m0,017s