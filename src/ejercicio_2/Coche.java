package ejercicio_2;

public class Coche {

    static final String marca = "Suzuki";
    static String modelo = "Jimny";
    final int potencia;

    public Coche(int potencia) {
        this.potencia = potencia;
    }
    public static void frenar() {
        System.out.println("Frenando");
    }

    public void acelerar() {
        System.out.println("Acelerando");
    }
}
