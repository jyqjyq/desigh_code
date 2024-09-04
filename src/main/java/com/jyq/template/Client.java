package com.jyq.template;

public class Client {
    public static void main(String[] args) {
        DocumentProcessor textProcessor = new TextDocumentProcessor();
        textProcessor.processDocument();

        System.out.println("-----------------------------");

        DocumentProcessor pdfProcessor = new PdfDocumentProcessor();
        pdfProcessor.processDocument();
    }
}