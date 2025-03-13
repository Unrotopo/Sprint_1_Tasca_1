package ejercicio_1;

public class Main {
    public static void main(String[] args) {

        Instrument instrumento1 = new Instrument("instrumento1", 60);
        Instrument instrumento2 = new Instrument("instrumento2", 100);

        Instrument.WindInstrument wind1 = new Instrument.WindInstrument();
        Instrument.StringInstrument string1 = new Instrument.StringInstrument();

        System.out.println();
        wind1.play();
        string1.play();

    }
}
