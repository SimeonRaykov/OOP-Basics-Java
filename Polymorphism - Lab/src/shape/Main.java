package shape;

public class Main {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(2,3);
        Circle circle = new Circle(5);

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());

    }
}
