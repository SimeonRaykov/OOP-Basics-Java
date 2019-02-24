package Box;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        if (length <= 0) {
            System.out.println("Length cannot be zero or negative.");
        } else if (width <= 0) {
            System.out.println("Width cannot be zero or negative.");
        } else if (height <= 0) {
            System.out.println("Height cannot be zero or negative.");
        } else {
            this.length = length;
            this.width = width;
            this.height = height;
        }
    }

    public double calcSurfaceArea() {
        return 2 * getWidth() * getLength() + 2 * getLength() * getHeight() + 2 * getWidth() * getHeight();
    }

    public double calcLateralSurcace() {
        return 2 * getLength() * getHeight() + 2 * getWidth() * getHeight();
    }

    public double calcVolume() {
        return getLength() * getHeight() * getWidth();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
