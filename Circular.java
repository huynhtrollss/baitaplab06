package Cau1;

class Circular implements Shape {
    private String color;

    public Circular(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circular");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void rotate(int angle) {
        System.out.println("Rotating a circular by " + angle + " degrees");
    }
}

