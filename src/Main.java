//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Circulo circulo = new Circulo("Círculo Rojo", 5.0);
        Rectangulo rectangulo = new Rectangulo("Rectángulo Azul", 4.0, 6.0);
// Calcular el área de cada figura
        circulo.calcularArea();
        rectangulo.calcularArea();
    }
}