import objects.*;

public class Main {
    public static void main(String[] args) {

        Instrument flute = new WindInstrument("flute", 60);
        Instrument piano = new StringInstrument("piano", 10_000);
        Instrument taiko = new PercussionInstrument("taiko", 6_000);

        flute.play();
        piano.play();
        taiko.play();
    }
}
