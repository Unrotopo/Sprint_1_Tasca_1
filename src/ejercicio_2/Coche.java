package ejercicio_2;

public class Coche {

    static final String marca = "Suzuki";
    static String modelo;
    final int potencia;

    public Coche() {
        modelo = "Jimny";
        potencia = 100;
    }
    public static void frenar() {
        System.out.println("Frenando");
    }

    public void acelerar() {
        System.out.println("Acelerando");
    }
}
