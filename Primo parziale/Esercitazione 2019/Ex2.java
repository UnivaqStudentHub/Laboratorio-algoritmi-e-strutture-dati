/*
 * Write a generic static method which accepts two arrays and returns a
 * linked list of all elements that appear in both arrays.
 * Then use the method on the Integer type. 
 * The output should be in sorted into increasing order. 
 */

import java.util.*;

public class Ex2 {
    public static <E extends Comparable<? super E>> LinkedList<E> appear(E [] a1,E [] a2){
        LinkedList<E> list = new LinkedList<>();

        Arrays.sort(a1);
        Arrays.sort(a2);

        int i=0, j=0;
        while(i<a1.length && j<a2.length){
            if(a1[i].compareTo(a2[j])>0) j++;
            if(a1[i].compareTo(a2[j])<0) i++;
            else {
                list.add(a2[j]);
                j++;
                i++;
            }
        }
        return list;

    }

    public static void main(String[] args) {
        Integer a1[] = {1,5,8,1};
        Integer a2[]  = {20,8,30,11};
        LinkedList<Integer> out = new LinkedList<>(appear(a1, a2));
    }
}
