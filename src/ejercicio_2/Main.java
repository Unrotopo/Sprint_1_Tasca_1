package ejercicio_2;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        System.out.println("Mi antiguo coche era un " + coche1.marca + " " + coche1.modelo + " de " + coche1.potencia + " CV.");

        coche1.modelo = "Jimny 1.5";
        // coche2.potencia = 200; No permitido

        System.out.println("Mi coche a subido de nivel, ahora es un " + coche1.modelo);
        System.out.println();

        System.out.println("Ahora todos los coches son " + coche2.modelo + " y tienen " + coche2.potencia + " CV.");
        System.out.println();

        coche1.acelerar();
        coche1.frenar();
    }
}
