package ejercicio_1;

public class Main {
    public static void main() {

        Instrument instrumento1 = new Instrument();
        Instrument instrumento2 = new Instrument();

        Instrument.WindInstrument wind1 = new Instrument.WindInstrument();
        Instrument.StringInstrument string1 = new Instrument.StringInstrument();

        System.out.println();
        wind1.play();
        string1.play();

    }
}
