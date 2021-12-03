package org.campus02.documents;

// ALT+ENTER
public class ImageDocument extends Document{

    private int sizeX;
    private int sizeY;
    private String colour;


    public ImageDocument(String filename, int sizeX, int sizeY, String colour) {
        super(filename);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.colour = colour;
    }


    public void printDocument() {
        System.out.println("Filename: " + filename);
        System.out.println("SizeX: " + sizeX);
        System.out.println("SizeY: " + sizeY); // STRG+D
        System.out.println("Colour: " + colour); // STRG+Cursor/links/rechts
    }
}
