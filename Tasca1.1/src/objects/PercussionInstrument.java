package objects;

public class PercussionInstrument extends Instrument {
    public PercussionInstrument(String name, int price) {
        super(name, price);
    }

    public void play(){
        System.out.println("\nPounding percussion instrument notes are felt on the ground...\n It sounds like a " + this.name);
    }
}
