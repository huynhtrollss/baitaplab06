package Cau1;


// Chương trình client để kiểm tra sản phẩm
public class Client {
    public static void main(String[] args) {
        Shape[] figures = new Shape[4];

        figures[0] = new Line("Red");
        figures[1] = new Circular("Blue");
        figures[2] = new Circular("Green");
        
        Composite composite = new Composite();
        composite.addShape(new Line("Yellow"));
        composite.addShape(new Line("Orange"));
        composite.addShape(new Line("Purple"));
        composite.addShape(new Circular("Pink"));
        figures[3] = composite;

        // Đổi màu đồng bộ cho tất cả các đối tượng trong mảng figures
        for (Shape figure : figures) {
            figure.setColor("Black");
        }

        // Quay 90 độ cho tất cả các đối tượng trong mảng figures
        for (Shape figure : figures) {
            figure.rotate(90);
        }
    }
}
