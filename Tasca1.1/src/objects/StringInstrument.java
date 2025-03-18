package objects;

public class StringInstrument extends Instrument {
    public StringInstrument(String name, int price) {
        super(name, price);
    }

    public void play(){
        System.out.println("\nSharp string instrument notes cut the air...\n It sounds like a " + this.name);
    }
}
