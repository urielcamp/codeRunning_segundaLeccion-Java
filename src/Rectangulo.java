public class Rectangulo extends FiguraGeometrica {
    // Atributos adicionales
    private double base;
    private double altura;
    private double area;

    // Constructor
    public Rectangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Métodos adicionales
    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    // Sobreescritura del método para calcular el área específico de un rectángulo
    @Override
    public void calcularArea() {
        // Implementación
        area = base * altura;
        System.out.println("Área del rectángulo " + "(" + getNombre() +"): " + area);
    }
}
