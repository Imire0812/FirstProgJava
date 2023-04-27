package hw14;

public class ClassJhu {
    public static int sumOfDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

        public static void main(String[] args) {
            System.out.println(sumOfDigits(12345));
        }}