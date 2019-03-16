package shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public double calculateArea() {
        return (this.radius * this.radius) * Math.PI;
    }
}
