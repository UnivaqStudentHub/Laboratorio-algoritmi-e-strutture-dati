import java.util.*;

class sortByData implements Comparator<Chiamata>{
    @Override
    public int compare(Chiamata o1, Chiamata o2) {
        return o1.getDataOra().compareTo(o2.getDataOra());
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
        Collections.sort(ordinato,new sortByData());

        return ordinato;
    }


}
