package melipack.Esercizi.D2021_2022.Svolgimenti.Appello1.Esercizio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Università {
    private List<Docente> docenti;

    public Università(List<Docente> docenti) {
        this.docenti = docenti;
    }

    public List<Docente> getDocenti() {
        return docenti;
    }

    public void setDocenti(List<Docente> docenti) {
        this.docenti = docenti;
    }

    //funzione 1
    public boolean aggiungiDocente(Docente d) {
        if (docenti.contains(d)) {
            return false;
        } else {
            docenti.add(d);
            return true;
        }
    }

    //funzione 2
    public boolean eliminaDocenteByCodice(String codice) {
        for (Docente d : docenti) {
            if (d.getCodice().equals(codice)) {
                docenti.remove(d);
                return true;
            }
        }
        return false;
    }

    //funzione 3
    public int etaMinima(){
        int min = docenti.get(0).getEta();
        for(Docente d : docenti){
            if(d.getEta() < min){
                min = d.getEta();
            }
        }
        return min;
    }

    //funzione 4
    public int etaPiuRappresentata(){
        int[] eta = new int[docenti.size()];
        for(Docente d : docenti){
            eta[d.getEta()]++;
        }
        int index = eta[0];
        for (int i = 1; i < eta.length; i++) {
            if (eta[i] > eta[index])
                index = i;
        }
        return index;
    }

    //funzione 5
    public List<Docente> docentiOrdina(){
        List<Docente> toSort = docenti;
        Collections.sort(toSort);
        return toSort;
    }

    //funzione 6
    public List<Docente> estraiGiovani(int etaMinima){
        List<Docente> giovani = new ArrayList<>();
        for(Docente d : docenti){
            if(d.getEta() < etaMinima){
                giovani.add(d);
            }
        }
        giovani.sort(new Cmp());

        return giovani;
    }
    public class Cmp implements Comparator<Docente> {
        @Override
        public int compare(Docente d1, Docente d2) {
            String s1 = d1.getCognome() + d1.getNome();
            String s2 = d2.getCognome() + d2.getNome();
            return s1.compareTo(s2);
        }
    }
}




