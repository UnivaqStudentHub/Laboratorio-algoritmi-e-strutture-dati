import java.util.*;

public class Archivio {
    private ArrayList<Automobile> automobili;

    class ComparatoreTarghe implements Comparator<Automobile>{
        @Override
        public int compare(Automobile o1, Automobile o2) {
            return o1.getTarga().compareTo(o2.getTarga());
        }
    }

    class ComparatoreCodiceFiscale implements Comparator<Automobile>{
        @Override
        public int compare(Automobile o1, Automobile o2) {
            return o1.getCliente().getCodiceFiscale().compareTo(o2.getCliente().getCodiceFiscale());
        }
    }

    public Archivio() {  //creazione di un archivio inizialmente vuoto
    }

    public void add(Automobile automobile){
        Automobile searched = search(automobile);
        if(searched!=null) updatePropietario(automobile,searched);
        else automobili.add(automobile);
    }

    public void updatePropietario(Automobile newAutomobile,Automobile toUpdate){

        toUpdate.setCliente(newAutomobile.getCliente());
        for(Automobile a:automobili){
            if(a.equals(toUpdate)) a.update(toUpdate);
        }
    }

    public void delete(Automobile automobile){
        Iterator<Automobile> iterator=automobili.iterator();
        for(Automobile a:automobili){
            if(a.equals(automobile)) iterator.remove();
        }
    }

    public Archivio nuovoArchivioByCitta(String citta){
        Archivio archivioCitta = new Archivio();
        for (Automobile a:automobili){
            if(a.getCliente().getResidenza().equals(citta)) archivioCitta.add(a);
        }
        return archivioCitta;
    }

    public void ordinaTargaCrescente(){
        automobili.sort(new ComparatoreTarghe());
    }

    public void ordinaCodiceFiscaleCrescente(){
        automobili.sort(new ComparatoreCodiceFiscale());
    }

    public Automobile search(Automobile automobile){
        for (Automobile a:this.automobili){
            if(automobile.equals(a)) return a;
        }
        return null;
    }

    public void print(){
        for(Automobile a:automobili){
            System.out.println("Dati di: "+a.getCliente()+"\n"+
                                a.getTarga()+
                                a.getCliente().getResidenza()+
                                a.getCliente().getNominativo()+
                                a.getCliente().getCodiceFiscale()
                    );
        }
    }
}
