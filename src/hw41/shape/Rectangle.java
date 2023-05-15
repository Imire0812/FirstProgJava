package hw41.shape;

public class Rectangle implements Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width * height);
    }
}
