package com.jyq.template;

public abstract class DocumentProcessor {
    // 模板方法，定义了处理文档的流程
    public final void processDocument() {
        openDocument();
        readDocument();
        processContent();
        saveDocument();
        closeDocument();
    }

    // 基本方法，由子类实现
    protected abstract void openDocument();
    protected abstract void readDocument();
    protected abstract void processContent();
    protected abstract void saveDocument();
    protected abstract void closeDocument();
}