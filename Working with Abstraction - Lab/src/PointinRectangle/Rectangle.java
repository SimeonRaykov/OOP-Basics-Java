package PointinRectangle;


public class Rectangle {

    private int topleftX;
    private int topleftY;
    private int bottomRightX;
    private int bottomRightY;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.topleftX = x1;
        this.topleftY = y1;
        this.bottomRightY = x2;
        this.bottomRightY = y2;
    }

    public int getTopleftX() {
        return topleftX;
    }

    public void setTopleftX(int topleftX) {
        this.topleftX = topleftX;
    }

    public int getTopleftY() {
        return topleftY;
    }

    public void setTopleftY(int topleftY) {
        this.topleftY = topleftY;
    }

    public int getBottomLeftX() {
        return bottomRightX;
    }

    public void setBottomLeftX(int bottomLeftX) {
        this.bottomRightX = bottomLeftX;
    }

    public int getBottomRightY() {
        return bottomRightY;
    }

    public void setBottomRightY(int bottomRightY) {
        this.bottomRightY = bottomRightY;
    }

    public boolean contains(Point point) {
        boolean isHorizontal = false;
        if (point.getX() >= this.getTopleftX() && point.getX() <= this.getBottomLeftX()) {
            isHorizontal = true;
        }
        boolean isVertical = false;
        if (point.getY() >= this.getTopleftY() && this.getBottomRightY() >= point.getY()) {
            isVertical = true;
        }
        return isVertical && isHorizontal;
    }
}
