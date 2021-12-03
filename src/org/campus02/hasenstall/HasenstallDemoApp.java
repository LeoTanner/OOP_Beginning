package org.campus02.hasenstall;

import java.util.ArrayList;

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

        // Funktioniert nicht und liefert ClassCastException, da wh2 kein Osterhase!!
        //OsterHase wh2AlsOsterhase = (OsterHase) wh2;
        //wh2AlsOsterhase.bemaleOstereier();

        ArrayList<Hase> stall = new ArrayList<>();
        stall.add(felix);
        stall.add(santa);
        stall.add(allgemeinerFeldhase);

        System.out.println("\nstall mit Hasen-Objekte");
        for (Hase h : stall) {
            h.fressen();
        }
        for (Hase h : stall) {
            h.verteilen();
        }

    }
}
