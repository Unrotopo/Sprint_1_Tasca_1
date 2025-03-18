package objects;

public class Smartphone extends Phone implements Camera, Clock {

    public void takePhoto() {
        System.out.println("Se está haciendo una foto");
    }

    public void alarm() {
        System.out.println("Está sonando la alarma");
    }
}