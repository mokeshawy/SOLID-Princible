package com.company.openclosed.good.open.close;

public class ShapePrinter {

    public void drawShape( Shape shape){
        shape.draw();

        Shape shape1 = new Square(); // polymorphism
        Shape shape2 = new Rectangle(); // polymorphism

        shape1.draw();
        shape2.draw();
    }
}
