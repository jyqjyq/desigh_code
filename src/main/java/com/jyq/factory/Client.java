package com.jyq.factory;

public class Client {
    public static void main(String[] args) {
        // 创建圆形工厂并绘制圆形
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        // 创建矩形工厂并绘制矩形
        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();

        // 创建三角形工厂并绘制三角形
        ShapeFactory triangleFactory = new TriangleFactory();
        Shape triangle = triangleFactory.createShape();
        triangle.draw();
    }
}