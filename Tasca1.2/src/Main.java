public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(100);

        System.out.println("Mi coche era un " + Car.BRAND + " " + Car.model + " de " + car1.HORSEPOWER + " CV.\n");

        Car.model = "Jimny 1.5";

        System.out.println("Mi coche ahora es un " + Car.BRAND + " " + Car.model + " de " + car1.HORSEPOWER + " CV.\n");

        car1.carAccelerate();
        Car.carBreak();
    }
}
