/*
Scrivere un metodo generico statico che riceve come argomento una lista L di oggetti di
un tipo T (usare la classe LinkedList per rappresentare la lista) e verifica se la lista
contiene gli elementi ordinati secondo il criterio di ordinamento naturale
 */

package Esercizio2;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex2 {
    //SBAGLIATO
    public static <T extends Comparable<? super T>> boolean contiene (LinkedList<T> list){
        T previus = list.getFirst();
        for(int i=1;i<list.size();i++){
            if(previus.compareTo(list.get(i))>0) return false;
            previus=list.get(i);
        }
        return true;
    }

    //GIUSTO
    public static <T extends Comparable<? super T>> boolean contieneConIterator (LinkedList<T> list){
        Iterator<T> iterator = list.iterator();
        T previous = iterator.next();
        while (iterator.hasNext()){
            T temp = iterator.next();
            if(previous.compareTo(temp)>0) return false;
            previous= iterator.next();
        }
        return true;
    }
}
