package Cau1;

class Line implements Shape {
    private String color;

    public Line(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a line");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void rotate(int angle) {
        System.out.println("Rotating a line by " + angle + " degrees");
    }
}
