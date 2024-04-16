public class FiguraGeometrica {
    // Atributos
    private String nombre;


    // Constructor
    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }

    // Método
    public String getNombre(){
        return nombre;
    }

    // Método para calcular el área (debe ser sobreescrito por las clases derivadas)
    public void calcularArea(){

    }

}