public class Vendedor extends Empleado {
    // Sobreescritura del método para calcular salario de vendedor
    @Override
    public void calcularSalario(){
        System.out.println("Calculando salario de vendedor");
    }
}