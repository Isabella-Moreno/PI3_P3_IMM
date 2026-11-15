package Ejercicio3;

public abstract class Entrenador {

    // --- CASO 2: MÉTODO DEFAULT EN CLASE ABSTRACTA (ERROR DE COMPILACIÓN) ---
    // La palabra clave 'default' para métodos con cuerpo solo es válida dentro de interfaces (desde Java 8).
    // Descomenta para observar el error: "Modifier 'default' not allowed here"
    /*
    default void dirigir() {
        System.out.println("Dirigiendo entrenamiento.");
    }
    */

    // En una clase abstracta, los métodos con implementación por defecto son simplemente métodos concretos normales:
    public void dirigir() {
        System.out.println("El entrenador está dirigiendo la práctica.");
    }
}