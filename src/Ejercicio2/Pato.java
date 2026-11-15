package Ejercicio2;

public class Pato implements Volador, Nadador {

    private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println("El pato " + nombre + " extiende sus alas y vuela sobre el lago.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato " + nombre + " nada tranquilamente usando sus patas palmeadas.");
    }
}