

import java.util.*;

public class Ex3 {
/**
 * Write a generic static method to find largest element in an array.
 * Then use the method on the Integer type.
**/
    public static <E extends Comparable<? super E>> E max(E array[]) {
        E max = array[0];

        int lunghezza = array.length;
        for(int i=1;i<lunghezza;i++){
            if(array[i].compareTo(max)>0) max=array[i];
        }
        

        return max;
    }


/**
  * Write a generic method which accepts an array and returns the
  * smallest item. Then use the method on the String type.
**/

    public static <E extends Comparable<? super E>> E min(E array[]){
        E min = array[0];

        for(int i=1;i<array.length;i++){
            if(array[i].compareTo(min)<0) min = array[i];
        }

        return min;
    }


    public static void main(String[] args) {
        Integer array[] = new Integer[]{1,2,3,4};
        Integer outMax = Ex3.max(array);
    }
    
}
