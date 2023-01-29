package melipack.Esercizi.D2021_2022.Svolgimenti.Appello5.Esercizio1;

import java.util.*;

public class Biblioteca {
    HashMap<Libro,Integer> libri = new HashMap<>();

    //esercizio 1b
    public void add(Libro libro, int numero){
            libri.put(libro,numero);
    }

    //esercizio 2b
    public boolean remove(Libro libro, int numero){
        if(libri.get(libro)<numero){
            return false;
        }
        else{
            libri.put(libro,libri.get(libro)-numero);
            return true;
        }
    }

    //esercizio 3b
    public Set<Libro> ordinaPerCodice(){
        Set<Libro> set = libri.keySet();
        List<Libro> list = new ArrayList<>(set);
        Collections.sort(list);
        set.clear();
        set.addAll(list);
        return set;
    }

    //esercizio 4b
    public Set<Libro> ordinaPerPrezzo(){
        Set<Libro> set = libri.keySet();
        List<Libro> list = new ArrayList<>(set);
        Collections.sort(list,new ordinaPrezzo());
        set.clear();
        set.addAll(list);
        return set;
    }

    //esercizio 5b
    public Set<Libro> trovaLibri(int minPagine){
        Set<Libro> set = libri.keySet();
        List<Libro> list = new ArrayList<>(set);
        List<Libro> daOrdinare = new ArrayList<>();
        for(Libro libro : list){
            if(libro.getPagine()>minPagine){
                daOrdinare.add(libro);
            }
        }
        Collections.sort(daOrdinare);
        set.clear();
        set.addAll(daOrdinare);
        return set;
    }

    //esercizio 6b
    public int getNumeroCopie(){
        int copie = 0;
        for(Libro libro : libri.keySet()){
            copie = copie + libri.get(libro);
        }
        return copie;
    }


    public class ordinaPrezzo implements Comparator<Libro>{
        @Override
        public int compare(Libro o1, Libro o2) {
            return o1.getPrezzo()-o2.getPrezzo();
        }
    }

}
