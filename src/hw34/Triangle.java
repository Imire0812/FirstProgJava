package hw34;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Значения сторон треугольника должны быть положительными.");
        }
        if (!checkSides(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Невозможно создать треугольник с заданными сторонами.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static boolean checkSides(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}