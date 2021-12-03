package org.campus02.hasenstall;

// konkretere Version von Hase
public class WeihnachtsHase extends Hase {

    private int countGifts;

    public WeihnachtsHase(String name, int countGifts) {
        super(name); // Super ruft den Konstruktor in der Basisklasse auf
        this.countGifts = countGifts;
    }

    public WeihnachtsHase(String name) {
        super(name);
        this.countGifts = 1;
    }

    @Override // Annotation
    public void verteilen() {
        super.verteilen();
        System.out.println(super.name + " legt die Geschenke unter den Christbaum");
    }
}
