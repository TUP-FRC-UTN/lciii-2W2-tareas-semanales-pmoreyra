package veterinaria02;

public class Cliente 
{
    private int nroCliente;
    private String nombre;
    private int antig;

    public int getNroCliente() {
        return nroCliente;
    }
    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntig() {
        return antig;
    }
    public void setAntig(int antig) {
        this.antig = antig;
    }
    
    public Cliente(){
    }

    public Cliente(int nroCliente, String nombre, int antig) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.antig = antig;
    }

    @Override
    public String toString() {
        return  "Numero de Cliente: " + nroCliente + ", Nombre: " + nombre + ", Antigüedad: " + antig;
    }
    
    
}
