package ejercicio_2;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche(100);

        System.out.println("Mi primer coche era un " + coche1.marca + " " + coche1.modelo + " de " + coche1.potencia + " CV.");

        Coche coche2 = new Coche(169);
        coche2.modelo = "Jimny 1.5";

        System.out.println("Mi segundo coche era un " + coche2.marca + " " + coche2.modelo + " de " + coche2.potencia + " CV.");
        System.out.println();

        System.out.println("Mi primer coche ahora es un " + coche1.marca + " " + coche1.modelo + " de " + coche1.potencia + " CV.");
        System.out.println();

        coche1.acelerar();
        coche1.frenar();
    }
}
