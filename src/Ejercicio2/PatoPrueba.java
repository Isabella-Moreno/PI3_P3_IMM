package Ejercicio2;

import java.util.Scanner;

public class PatoPrueba {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Nombre del pato: ");
        String nombre = sc.nextLine();

        Pato pato = new Pato(nombre);

        System.out.println("\n--- COMPORTAMIENTOS DEL PATO ---");
        pato.volar();
        pato.nadar();
    }
}