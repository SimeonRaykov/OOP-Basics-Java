package shape;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return (this.height + this.width) * 2;
    }

    @Override
    public double calculateArea() {
        return this.height * this.width;
    }
}
