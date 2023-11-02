package Cau1;

import java.util.ArrayList;
import java.util.List;


// Lớp Composite
class Composite implements Shape {
    private List<Shape> shapes;
    private String color;

    public Composite() {
        this.shapes = new ArrayList<>();
        this.color = "";
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a composite shape");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        for (Shape shape : shapes) {
            shape.setColor(color);
        }
    }

    @Override
    public void rotate(int angle) {
        System.out.println("Rotating a composite shape by " + angle + " degrees");
        for (Shape shape : shapes) {
            shape.rotate(angle);
        }
    }

}