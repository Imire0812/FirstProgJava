package hw38;

public class Task2Exception {
    public static void main(String[] args) {
        try {
            test(args);
        } catch (MyOwnException e){
            System.out.println("ая яй, наше исключение: " + e.getMessage());
        }

    }
    public static void test(String[] args) {
        if(args.length != 0){
            throw new MyOwnException("Программа не умеет обрабатывать аргументы командной строки");
        }
    }
}
