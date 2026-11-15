package Ejercicio3;

public class UsoIncorrectoPrueba {

    public void iniciar() {
        // --- CASO 1: CLASE CONCRETA QUE NO IMPLEMENTA MÉTODOS DE LA INTERFAZ ---
        // Si declaras: public class Futbolista implements Jugador {} sin implementar jugar(),
        // Java lanza el error: "Class 'Futbolista' must either be declared abstract or implement abstract method 'jugar()' in 'Jugador'"

        System.out.println("--- ANÁLISIS EJERCICIO 3 ---");
        System.out.println("1. Interfaz sin implementar: Una clase concreta está obligada a definir todos los métodos "
                + "abstractos de la interfaz que implementa; de lo contrario, debe declararse como 'abstract'.");
        System.out.println("2. Modificador 'default' en clase abstracta: No compila porque 'default' fue creado "
                + "exclusivamente para permitir evolución de interfaces sin romper implementaciones existentes. "
                + "En una clase abstracta basta con escribir un método concreto normal (ej. public void dirigir()).");
    }
}