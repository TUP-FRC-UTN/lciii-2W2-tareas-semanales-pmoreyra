package veterinaria02;
import java.util.Scanner;

public class claseMain 
{
    public static void main(String[] args)
    {
        Cliente []clientes;
        Mascota []mascotas;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de clientes: ");
        int cantClientes = sc.nextInt();
        
        clientes = new Cliente[cantClientes];
        mascotas = new Mascota[cantClientes];
        int acuEdad=0;        
        for (int i = 0; i < clientes.length; i++)
        {
            System.out.println("Ingrese el nro de cliente: ");
            int nroCliente = sc.nextInt();
            System.out.println("Ingrese el nombre del cliente: ");
            sc.nextLine();
            String nombre = sc.nextLine();
            System.out.println("Ingrese la antigüedad del cliente: ");
            int antig = sc.nextInt();
            System.out.println("Ingrese el nombre de la mascota: ");
            sc.nextLine();
            String nombreMascota = sc.nextLine();
            System.out.println("Ingrese la edad de la mascota: ");
            int edadMascota = sc.nextInt();            
            acuEdad = acuEdad + edadMascota;
            
            clientes[i] = new Cliente(nroCliente, nombre, antig);
            mascotas[i] = new Mascota(nombreMascota, edadMascota);
        }
        
        System.out.println("La cantidad de clientes es: " + cantClientes);
        
        System.out.println("El promedio de edad de las mascotas es: " + ((double)acuEdad/cantClientes));
        
        int clientesAntiguos = 0;
        for (int i = 0; i < clientes.length; i++)
        {
            if (clientes[i].getAntig()>=5)
            {
                clientesAntiguos++;                            
            }   
        }
        System.out.println("La cantidad de clientes con antigüedad igual o mayor a 5 años es: " + clientesAntiguos);     
    }
    
}
