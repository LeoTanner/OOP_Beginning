package org.campus02.hasenstall;

public class Hase {
    private String name;

    public Hase(String name) {
        this.name = name;
    }

    public void schlafen(){
        System.out.println(name + " schläft");
    }

    public void hoppeln() {
        System.out.println(name + " hoppelt");
    }

    public void fressen() {
        System.out.println(name + " isst gerne Gemüse");
    }

    public void verteilen() {
        System.out.println(name + " ist ein normaler Hase und verteilt nichts");
    }
}
