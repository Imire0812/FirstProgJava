package hw56.hw;

public class Main {
    public static String reverse(int x) {
        if (x < 10) {
            return Integer.toString(x);
        } else {
            return Integer.toString(x % 10) + reverse(x / 10);
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        String reversed = reverse(number);
        System.out.println("Reversed number: " + reversed);
    }
}
