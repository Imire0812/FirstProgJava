package hw19;

public class StudentClass {
    public static void main(String[] args) {
        int[] ages = { 19, 20, 18, 22, 21, 19 };

        int maxAge = ages[0];
        int maxAgeIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > maxAge) {
                maxAge = ages[i];
                maxAgeIndex = i;
            }
        }

        System.out.println("Самый старший студент:");
        System.out.println("Номер в списке: " + (maxAgeIndex + 1));
        System.out.println("Возраст: " + maxAge);
    }
}
