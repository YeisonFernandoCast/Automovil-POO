import java.util.Scanner;


public class Principal {

    
    private static final int i = 0;

    public static int indiceCocheBarato(Vehiculo coches[]){
        float precio;
        int indice =0;
  
        precio = coches[i].getprecio();
        for(int i=1; i< coches.length; i++);
            
            if(coches[i].getprecio() < precio){
                precio = coches[i].getprecio();
                indice = i;  
                
            }
            return indice;
        }
        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int  numeroVehiculos, indiceBarato;

        System.out.println("Digite el numero de vehículos: ");
        numeroVehiculos = entrada.nextInt();

        // se crean los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        for (int i=0; i< coches.length; i++){
            entrada.nextLine();
            System.out.println("\n Digite las catacteristicas del Auto "+ (i+1)+ ":");
            System.out.println("digte la marca del auto: ");
            marca = entrada.nextLine();
            System.out.println("digte el modelo del auto: ");
            modelo = entrada.nextLine();
            System.out.println("digte el precio del auto: ");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);

        }
        indiceBarato = indiceCocheBarato(coches);
        System.out.println("**********************");
        System.out.println("El coche mas barato es: ");
        System.out.println("**********************");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }    
}
