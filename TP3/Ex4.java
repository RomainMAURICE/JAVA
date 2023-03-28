public abstract class Ex4 {

    public static void swap(int[] array, int index1, int index2){
        int a = array[index1];
        int b = array[index2];
        array[index1]=b;
        array[index2]=a;
    }

    /*public static int indexOfMin(int[] array){
        int min=array[0];
        for(int i: array){
            if(i<min){
                min=i;
            }
        }
        return min;
    }*/

    public static int indexOfMin2(int[] array, int index1, int index2){
        int min=array[index1];
        int i;
        for(i=index1; i<index2; i++){
            if(array[i]<min){
                min=i;
            }
        }
        return min;
    }

    public static void sort(int[] array, int index1, int index2){
        if(index2<index1){
            return;
        }
        swap(array, index1, indexOfMin2(array, index1, index2));
        sort(array, index1+1, index2);
    }

    public static void sortW(int[] array){
        int index1=0;
        int index2= array.length;
        sort(array, index1, index2);
    }
}
