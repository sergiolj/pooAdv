package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval;

import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.Circle;
import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.Rectangle;
import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(3.0);
        Shape s2 = new Rectangle(5.0, 4.0);
        System.out.printf("Área do Retângulo: " + s2.calculateArea() + "\n");
        System.out.printf("Area do círculo: %.2f\n", s1.calculateArea());
    }
}
