package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        super.area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
