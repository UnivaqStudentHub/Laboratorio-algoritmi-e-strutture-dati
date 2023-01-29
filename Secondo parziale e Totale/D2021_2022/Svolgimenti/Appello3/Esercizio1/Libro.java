package melipack.Esercizi.D2021_2022.Svolgimenti.Appello3.Esercizio1;

import java.util.Objects;

public class Libro implements Comparable<Libro> {
    private String codice;
    private String cognomeAutore;
    private String nomeAutore;
    private int prezzo;

    public Libro(String codice, String cognomeAutore, String nomeAutore, int prezzo) {
        this.codice = codice;
        this.cognomeAutore = cognomeAutore;
        this.nomeAutore = nomeAutore;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCognomeAutore() {
        return cognomeAutore;
    }

    public void setCognomeAutore(String cognomeAutore) {
        this.cognomeAutore = cognomeAutore;
    }

    public String getNomeAutore() {
        return nomeAutore;
    }

    public void setNomeAutore(String nomeAutore) {
        this.nomeAutore = nomeAutore;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codice='" + codice + '\'' +
                ", cognomeAutore='" + cognomeAutore + '\'' +
                ", nomeAutore='" + nomeAutore + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return prezzo == libro.prezzo && Objects.equals(codice, libro.codice) && Objects.equals(cognomeAutore, libro.cognomeAutore) && Objects.equals(nomeAutore, libro.nomeAutore);
    }

    public int compareTo(Libro libro) {
        String cognomeNomeAutore = this.getCognomeAutore() + this.getNomeAutore();
        String cognomeNomeAutore2 = libro.getCognomeAutore() + libro.getNomeAutore();
        return cognomeNomeAutore.compareTo(cognomeNomeAutore2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codice, cognomeAutore, nomeAutore, prezzo);
    }
}
