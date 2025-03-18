package objects;

public abstract class Instrument {

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

    static {
        System.out.println("Bloque estático, da igual dónde esté");
    }

    {
        System.out.println("Bloque inicialización 2");
    }

    public void play(){}

}

