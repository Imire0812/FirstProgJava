package hw62;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        writeToFile(students, "res/students.txt");
    }

    private static void writeToFile(List<Student> students, String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Student student: students){
            fileWriter.write(student.toString() + "\n");
        }
        fileWriter.close();
    }
    private static List<Student> readFromFile(String fileName) throws IOException{
        Scanner scanner = new Scanner(new File(fileName));
        List<Student> result = new ArrayList<>();
        while (scanner.hasNext()){
            result.add(Student.parse(scanner.nextLine()));
        }
        scanner.close();
        return result;
    }
    private static List<Student> createStudentList(){

        return null;
    }

}
