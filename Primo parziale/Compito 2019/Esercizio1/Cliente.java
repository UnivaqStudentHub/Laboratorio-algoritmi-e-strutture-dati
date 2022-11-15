public class Cliente {
    private String nominativo;
    private String codiceFiscale;
    private String residenza;

    public Cliente(String nominativo,String codiceFiscale,String residenza){
        this.nominativo=nominativo;
        this.codiceFiscale=codiceFiscale;
        this.residenza=residenza;
    }

    public String getNominativo(){
        return this.nominativo;
    }
    public String getCodiceFiscale(){
        return this.codiceFiscale;
    }
    public String getResidenza(){
        return this.residenza;
    }
    public boolean equals(Cliente cliente){
        return this.nominativo.equals(cliente.getNominativo()) &&
                this.residenza.equals(cliente.getResidenza()) &&
                this.codiceFiscale.equals(cliente.getCodiceFiscale());
    }
}
