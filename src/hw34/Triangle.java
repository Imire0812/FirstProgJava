package hw34;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("Значения сторон треугольника должны быть положительными.");
        }
        if (!checkSides(side1, side2, side3)) {
            throw new IllegalArgumentException("Невозможно создать треугольник с заданными сторонами.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public static boolean checkSides(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}