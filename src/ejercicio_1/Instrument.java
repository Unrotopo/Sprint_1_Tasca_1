package ejercicio_1;

public class Instrument {

    static{
        System.out.println("Bloque estático, solo se carga una vez");
    }

    public String name;
    public int price;

    {
        System.out.println("Bloque inicialización 1");
    }

    public Instrument(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("Constructor!");
    }

    {
        System.out.println("Bloque inicialización 2");
    }

    void play(){}

    public static class WindInstrument {
        void play(){
            System.out.println("Está sonando un instrumento de viento.");
        }
    }
    public static class StringInstrument {
        void play(){
            System.out.println("Está sonando un instrumento de cuerda");
        }
    }
    public static class PercussionInstrument {
        void play(){
            System.out.println("Está sonando un instrumento de percusión");
        }
    }
}

