import javax.xml.stream.events.Comment;
import java.util.*;

class SortDecrescenteByData implements Comparator<Chiamata>{
    @Override
    public int compare(Chiamata o1, Chiamata o2) {

        return -o1.getDataOra().compareTo(o2.getDataOra());
    }
}
class SortCrescenteByNumero implements Comparator<Chiamata>{
    @Override
    public int compare(Chiamata o1, Chiamata o2) {

        return o1.getNumTel().compareTo(o2.getNumTel());
    }
}

class SortCrescenteByDurata implements Comparator<Chiamata>{
    @Override
    public int compare(Chiamata o1, Chiamata o2) {

       if(o1.getDurata()- o2.getDurata()>1) return 1;
       if(o1.getDurata()- o2.getDurata()<1) return -1;
       return 0;
    }
}

public class Cellulare {
    private double carica;
    private int numeroChiamate;
    private ArrayList<Chiamata> elencoChiamate;

    public Cellulare(double carica) {
        this.carica = carica;
    }

    public void ricarica( double ricarica){
        this.carica = this.carica+ricarica;
    }

    public void chiama(String numeroTel, Date inizioDataOra, int durata){
        Chiamata chiamata = new Chiamata(numeroTel,inizioDataOra,durata);
        elencoChiamate.add(chiamata);
        this.numeroChiamate = this.numeroChiamate+1;
        this.carica = this.carica - ((durata/60)*0.15);
    }
    public double totaleChiamate(){
        double temp = 0;
        for(Chiamata chiamata:elencoChiamate){
            temp = chiamata.getDurata() + temp;
        }
        return temp;
    }

    public ArrayList<Chiamata> getSottoelenco (String numeroTel){
        ArrayList<Chiamata> sottoelenco = new ArrayList<Chiamata>();
        for(Chiamata chiamata:elencoChiamate){
            if(chiamata.getNumTel().equals(numeroTel)) sottoelenco.add(chiamata);
        }
        return sottoelenco;
    }

    public ArrayList<Chiamata> getElencoOrdinatoPerDataOraC(){
        ArrayList<Chiamata> ordinato = new ArrayList<>();
        for(Chiamata chiamata:elencoChiamate){
         ordinato.add(chiamata);
        }
        Collections.sort(ordinato);

        return ordinato;
    }
    public ArrayList<Chiamata> getElencoOrdinatoPerDataOraD(){
        ArrayList<Chiamata> ordinato = new ArrayList<>();
        for(Chiamata chiamata:elencoChiamate){
            ordinato.add(chiamata);
        }
        Collections.sort(ordinato,new SortDecrescenteByData());

        return ordinato;
    }

    public ArrayList<Chiamata> getElencoOrdinatoPerNumero(){
        ArrayList<Chiamata> ordinato = new ArrayList<>();
        for(Chiamata chiamata:elencoChiamate){
            ordinato.add(chiamata);
        }
        Collections.sort(ordinato,new SortCrescenteByNumero());
        return ordinato;
    }

    public ArrayList<Chiamata> getElencoOrdinatoPerDurata(){
        ArrayList<Chiamata> ordinato = new ArrayList<>();
        for(Chiamata chiamata:elencoChiamate){
            ordinato.add(chiamata);
        }
        Collections.sort(ordinato,new SortCrescenteByDurata());
        return ordinato;
    }


}
