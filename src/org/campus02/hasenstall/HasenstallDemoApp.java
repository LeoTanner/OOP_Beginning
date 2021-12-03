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

    }
}
