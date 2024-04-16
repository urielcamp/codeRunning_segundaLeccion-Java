// Clase derivada
public class Circulo extends FiguraGeometrica {
    // Atributos adicionales
    private double radio;
    private double area;


    // Constructor
    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    // Método adicional
    public double getRadio(){
        return radio;
    }

    // Sobreescritura del método para calcular el área específico de un círculo
    @Override
    public void calcularArea() {
        // Implementación
        area = (radio * radio) * Math.PI;
        System.out.println("Área del círculo " + "(" +  getNombre() + "): " + area );
    }
}
