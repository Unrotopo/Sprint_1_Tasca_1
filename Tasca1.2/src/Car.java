public class Car {

    static final String BRAND = "Suzuki";
    static String model = "Jimny";
    final int HORSEPOWER;

    public Car(int HORSEPOWER) {
        this.HORSEPOWER = HORSEPOWER;
    }

    public static void carBreak() {
        System.out.println("Breaking");
    }

    public void carAccelerate() {
        System.out.println("Accelerating");
    }
}
