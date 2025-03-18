package ejercicio_3;

public class Phone {

    private String brand;
    private String model;

    void call(String phoneNum) {
        System.out.println("Llamando a: " + phoneNum);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
