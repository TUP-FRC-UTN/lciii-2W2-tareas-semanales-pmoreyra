package veterinaria02;

public class Mascota 
{
    private String nombreMascota;
    private int edadMascota;

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }
    
    public Mascota(){}

    public Mascota(String nombreMascota, int edadMascota) {
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }

    @Override
    public String toString() {
        return "Nombre de la Mascota: " + nombreMascota + ", Edad de la Mascota: " + edadMascota;
    }
    
    
    
}
