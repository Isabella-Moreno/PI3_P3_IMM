package Ejercicio1;

public abstract class Figura {

    protected String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.printf("Área del %s: %.2f%n", tipo, calcularArea());
    }
}