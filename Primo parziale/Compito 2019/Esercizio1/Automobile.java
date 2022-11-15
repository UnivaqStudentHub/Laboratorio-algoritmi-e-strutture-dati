import java.util.Comparator;

public class Automobile {
    private String targa;
    private Cliente cliente;

    public Automobile(String targa, Cliente cliente) {
        this.targa = targa;
        this.cliente = cliente;
    }

    public void setTarga(String targa){
        this.targa = targa;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public String getTarga(){
        return this.targa;
    }
    public Cliente getCliente(){
        return this.cliente;
    }

    public void update(Automobile automobile){
        this.targa=automobile.getTarga();
        this.cliente=automobile.getCliente();
    }

    public boolean equals (Automobile automobile){
        return automobile.getTarga().equals(this.targa) && automobile.getCliente().equals(this.cliente);
    }
}
