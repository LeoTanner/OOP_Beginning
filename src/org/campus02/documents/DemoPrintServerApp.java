package org.campus02.documents;

public class DemoPrintServerApp {

    public static void main(String[] args) {

        ImageDocument picture = new ImageDocument("picture.png", 800, 600, "blue");
        picture.printDocument();

        Document d = picture;
        d.printDocument();

        TextDocument textDocument = new TextDocument("text.txt", "Lorem Ipsum ....");
        textDocument.printDocument();

        PrintManager pm = new PrintManager();
        pm.addDocument(picture);
        pm.addDocument(textDocument);

        System.out.println("printall");
        pm.printAll();
    }
}
