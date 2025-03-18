package objects;

public class WindInstrument extends Instrument {
    public WindInstrument(String name, int price) {
        super(name, price);
    }

    public void play(){
        System.out.println("\nWhimsical wind instrument notes float in the air...\n It sounds like a " + this.name);
    }
}
