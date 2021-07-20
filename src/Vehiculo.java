 
 public class Vehiculo {

    private String marca;
    private String modelo;
    private Float precio;

        //constructor
        public Vehiculo (String marca, String modelo, Float precio) {
            this.marca = marca;
            this.modelo = modelo;
            this.precio = precio;
        }


    public float getprecio () {
        return precio;
    }
    
    public String mostrarDatos(){
        return "\n Marca: "+marca+"\n Modelo: "+modelo+"\n Precio es: " + precio + "\n";


    }
 }





