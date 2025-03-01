package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

public class Rectangle extends Shape {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
    area = width * height;
    return area;
    }
}
