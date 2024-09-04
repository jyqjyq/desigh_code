package com.jyq.template;

public class PdfDocumentProcessor extends DocumentProcessor {
    @Override
    protected void openDocument() {
        System.out.println("Opening PDF Document");
    }

    @Override
    protected void readDocument() {
        System.out.println("Reading PDF Document");
    }

    @Override
    protected void processContent() {
        System.out.println("Processing PDF Content");
    }

    @Override
    protected void saveDocument() {
        System.out.println("Saving PDF Document");
    }

    @Override
    protected void closeDocument() {
        System.out.println("Closing PDF Document");
    }
}