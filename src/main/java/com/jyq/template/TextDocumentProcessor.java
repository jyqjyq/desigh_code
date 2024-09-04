package com.jyq.template;

public class TextDocumentProcessor extends DocumentProcessor {
    @Override
    protected void openDocument() {
        System.out.println("Opening Text Document");
    }

    @Override
    protected void readDocument() {
        System.out.println("Reading Text Document");
    }

    @Override
    protected void processContent() {
        System.out.println("Processing Text Content");
    }

    @Override
    protected void saveDocument() {
        System.out.println("Saving Text Document");
    }

    @Override
    protected void closeDocument() {
        System.out.println("Closing Text Document");
    }
}