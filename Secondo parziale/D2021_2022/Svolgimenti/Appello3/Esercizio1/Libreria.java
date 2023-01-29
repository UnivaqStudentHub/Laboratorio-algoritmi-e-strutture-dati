package melipack.Esercizi.D2021_2022.Svolgimenti.Appello3.Esercizio1;

import java.util.*;

public class Libreria {
    private List<Libro> libri;

    public void addLibri(List<Libro> libri) {
        this.libri = libri;
    }
    public void addLibro(Libro libro) {
        this.libri.add(libro);
    }

    public void ordinaPerAutore(){
        Collections.sort(libri);
    }

    public void ordinaPerPrezzoDecr(){
        libri.sort(new OrdinaByPrezzoDecrescente());
    }

    public Set<Libro> trovaLibriByAuthor(String nome, String cognome){
        List<Libro> libriByAuthor = new ArrayList<>();
        for(Libro libro : libri) {
            if(libro.getNomeAutore().equals(nome) && libro.getCognomeAutore().equals(cognome)) {
                libriByAuthor.add(libro);
            }
        }
        libriByAuthor.sort(new OrdinaByPrezzoDecrescente());
        Set<Libro> libriByAuthorSet = new HashSet<>(libriByAuthor);
        return libriByAuthorSet;
    }

    public HashMap<Libro,Integer> libriInMagazzino(){
        HashMap<Libro,Integer> libriMap = new HashMap<>();
        for(Libro libro : libri){
            libriMap.put(libro,libriMap.get(libro)+1);
        }

        return libriMap;
    }


    class OrdinaByPrezzoDecrescente implements Comparator<Libro> {
        @Override
        public int compare(Libro o1, Libro o2) {
            return o2.getPrezzo() - o1.getPrezzo();
        }
    }

}
