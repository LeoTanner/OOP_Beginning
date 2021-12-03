package org.campus02.documents;

import java.util.ArrayList;

public class PrintManager {

    private ArrayList<Document> documents = new ArrayList<>();

    public void addDocument(Document document) {
        documents.add(document);
    }


    public void printAll() {
        for (Document doc : documents) {
            doc.printDocument();
        }
    }
}
