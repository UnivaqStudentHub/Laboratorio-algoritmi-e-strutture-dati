package melipack.Esercizi.D2021_2022.Svolgimenti.Appello1.Esercizio1;

import java.util.Objects;

public class Docente implements Comparable<Docente> {
    private String nome;
    private String cognome;
    private String codice;
    private int eta;

    public Docente(String nome, String cognome, String codice, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Docente docente = (Docente) o;
        return eta == docente.eta && Objects.equals(nome, docente.nome) && Objects.equals(cognome, docente.cognome) && Objects.equals(codice, docente.codice);
    }

    public int compareTo(Docente docente){
        if(!(this.eta==docente.eta)){
            return this.eta-docente.eta;
        }else{
            String thisNomeCognome = this.nome + this.cognome;
            String docenteNomeCognome = docente.nome + docente.cognome;
            return thisNomeCognome.compareTo(docenteNomeCognome);
        }
    }

}
