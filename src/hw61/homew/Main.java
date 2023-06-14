package hw61.homew;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 80));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 70));
        students.add(new Student("David", 85));
        students.add(new Student("Eve", 75));
        students.add(new Student("Frank", 95));
        students.add(new Student("Grace", 88));
        students.add(new Student("Henry", 82));
        students.add(new Student("Ivy", 79));
        students.add(new Student("Jack", 91));

        // Ask the user for the minimum passing score
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the minimum passing score: ");
        int minPassingScore = scanner.nextInt();

        // Filter, sort, and limit the list of students
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getScore() > minPassingScore)
                .sorted(Comparator.comparingInt(Student::getScore).reversed())
                .limit(10)
                .collect(Collectors.toList());

        // Print each student's details
        filteredStudents.forEach(System.out::println);
    }
}