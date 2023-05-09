package hw38;

public class MainQ {
    public static void main(String[] args) {
        System.out.println("У программы при запуске было " + args.length + " аргументов командной строки");
        for (String arg : args){
            System.out.println(args);
        }
    }
}
