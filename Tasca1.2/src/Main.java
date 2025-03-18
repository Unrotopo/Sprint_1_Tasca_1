public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche(100);

        System.out.println("Mi coche era un " + Coche.marca + " " + Coche.modelo + " de " + coche1.potencia + " CV.\n");

        Coche.modelo = "Jimny 1.5";

        System.out.println("Mi coche ahora es un " + Coche.marca + " " + Coche.modelo + " de " + coche1.potencia + " CV.\n");

        coche1.acelerar();
        Coche.frenar();
    }
}
