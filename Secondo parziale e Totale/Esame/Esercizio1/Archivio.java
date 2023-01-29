package melipack.Esame.Esercizio1;

import java.util.*;

public class Archivio {
    HashMap<String, TreeSet<Paziente>> archivio;    //uso TreeSet così ordina in base al cf,
                                                    //con il metodo definito dentro la classe Paziente

    public boolean insert (Paziente paziente, String reparto){
        List<String> reparti = new ArrayList<>(archivio.keySet());
        for(String r : reparti){
            if(archivio.get(r).contains(paziente)) return false;
        }
        if(archivio.containsKey(reparto)){
            archivio.get(reparto).add(paziente);
        }else{
            archivio.keySet().add(reparto);
            archivio.get(reparto).add(paziente);
        }

        return true;
    }
    public boolean delete(Paziente paziente, String reparto){
        if(archivio.get(reparto).contains(paziente)){
            archivio.get(reparto).remove(paziente);
            return true;
        }else{
            return false;
        }
    }

    public String find (Paziente p){
        List<String> reparti = new ArrayList<>(archivio.keySet());
        for(String r : reparti){
            if(archivio.get(r).contains(p)) return r;
        }
        return null;
    }

    public Set<Paziente> elencoReparto (String reparto){
         return archivio.get(reparto);
    }

    public Set<Paziente> elenco (){
        HashSet<Paziente> pazienti = new HashSet<>();
        List<String> reparti = new ArrayList<>(archivio.keySet());
        for(String r : reparti){
            pazienti.addAll(archivio.get(r));
        }

        List<Paziente> pazientiOrdinati=new ArrayList<>(pazienti);
        pazientiOrdinati.sort(new AgeComparator());

        pazienti.clear();
        pazienti.addAll(pazientiOrdinati);
        return pazienti;
    }

    public class AgeComparator implements Comparator<Paziente> {
        @Override
        public int compare(Paziente p1, Paziente p2){
            return p1.getEta()-p2.getEta();
        }
    }
}
