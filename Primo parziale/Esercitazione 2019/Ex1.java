/*
 * Create the following ArrayList instance and enter some words:
 * 	ArrayList<String> words = new ArrayList<String>();
 * Write the code to print 4-letter words using:
 * 1. For loop
 * 2. Advanced For loop
 * 3. Iterator
 */

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        String word;
        ArrayList<String> words = new ArrayList<String>();
        words.add("first");
        words.add("second");
        words.add("third");
        words.add("fourth");

        // Ciclo for
        for(int i=0;i<words.size();i++){
            word = words.get(i);
            if(word.length()==4)System.out.println(word);
        }

        // Advanced for
        for(String str:words){
            if(str.length()==4)System.out.println(str);
        }

        //Iterator
        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){
           word = iterator.next();
           System.out.print(word);
        }
    }    
}
