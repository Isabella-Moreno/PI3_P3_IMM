package Ejercicio1;

import java.util.Scanner;

public class FiguraPrueba {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Base del rectángulo: ");
        double baseRect = sc.nextDouble();
        System.out.print("Altura del rectángulo: ");
        double altRect = sc.nextDouble();
        Figura rectangulo = new Rectangulo(baseRect, altRect);

        System.out.print("\nBase del triángulo: ");
        double baseTri = sc.nextDouble();
        System.out.print("Altura del triángulo: ");
        double altTri = sc.nextDouble();
        Figura triangulo = new Triangulo(baseTri, altTri);

        System.out.println("\n--- RESULTADOS DE ÁREAS ---");
        rectangulo.mostrarArea();
        triangulo.mostrarArea();
    }
}