package org.campus02.hasenstall;

public class HasenstallDemoApp {

    public static void main(String[] args) {

        Hase allgemeinerFeldhase = new Hase("Feldhase 1");
        WeihnachtsHase santa = new WeihnachtsHase("Santa", 9999);
        OsterHase felix = new OsterHase("Felix");

        santa.fressen();
        santa.hoppeln();
        santa.schlafen();

        santa.verteilen();
        felix.verteilen();
        allgemeinerFeldhase.verteilen();

        // Up-Casting
        Hase wh = santa;
        Hase wh2 = new WeihnachtsHase("Christkind", 999);

        wh2.fressen();
        wh2.verteilen();
        wh2.verteilen();

        Hase oh = new OsterHase("Osterhase");
        oh.verteilen();

        // Down-Casting
        System.out.println("\ndowncasting");
        OsterHase osterHase = (OsterHase) oh; // Ich übernehme die Verantwortung
        osterHase.bemaleOstereier();

        OsterHase wh2AlsOsterhase = (OsterHase) wh2;
        wh2AlsOsterhase.bemaleOstereier();

    }
}
