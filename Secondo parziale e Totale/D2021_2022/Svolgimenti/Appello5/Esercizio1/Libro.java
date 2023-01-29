package melipack.Esercizi.D2021_2022.Svolgimenti.Appello5.Esercizio1;

import java.util.Objects;

public class Libro implements Comparable<Libro>{
    private  String codice;
    private  String titolo;
    private int pagine;
    private int prezzo;

    public Libro(String codice, String titolo, int pagine, int prezzo) {
        this.codice = codice;
        this.titolo = titolo;
        this.pagine = pagine;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
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
                "Codice='" + codice + '\'' +
                ", Titolo='" + titolo + '\'' +
                ", pagine=" + pagine +
                ", prezzo=" + prezzo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return pagine == libro.pagine && prezzo == libro.prezzo && Objects.equals(codice, libro.codice) && Objects.equals(titolo, libro.titolo);
    }

    public int compareTo(Libro libro){
        return this.codice.compareTo(libro.getCodice());
    }
}
