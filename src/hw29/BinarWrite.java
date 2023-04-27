package hw29;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class BinarWrite {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("res/in.txt"));
        int a = scanner.nextInt();
        scanner.close();

        String binary = decToBin(a);

        FileWriter outputFileWriter = new FileWriter("res/out.txt");
        outputFileWriter.write(binary);
        outputFileWriter.close();
    }

    public static String decToBin(int number){
        if(number == 0){
            return  "0";
        }
        StringBuilder binary = new StringBuilder();
        while (number > 0){
            binary.insert(0, number % 2);
            number /= 2;
        }
        return binary.toString();
    }
}