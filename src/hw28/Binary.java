package hw28;

import java.util.Scanner;

public class Binary {
/*
    Краткое описание работы метода:

    1. Если число равно нулю, возвращается строка "0".
    2. Создаётся массив символов, в который будут добавляться биты двоичного числа.
    3. Если число отрицательное, то выполняется дополнительный шаг: получается дополнительный код (two's complement)
    числа, чтобы обеспечить правильное отображение его в двоичной системе.
    4. Вычисляются все биты двоичного числа путём последовательного деления числа на два и добавления остатка в
    массив символов.
    5. Если число отрицательное, то инвертируются все биты, затем к результату прибавляется единица.
    6. Биты в массиве символов разворачиваются в обратном порядке.
    7. Возвращается строковое представление двоичного числа, полученное из массива символов.

 */

    public static String decToBin(int number) {
        if (number == 0) {
            return "0";
        }
        char[] binary = new char[32];
        int index = 0;
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = ~number + 1;
        }
        while (number > 0) {
            binary[index++] = (char) ((number % 2) + '0');
            number /= 2;
        }
        if (isNegative) {

            for (int i = 0; i < index; i++) {
                binary[i] = (binary[i] == '0') ? '1' : '0';
            }

            int carry = 1;
            for (int i = 0; i < index && carry > 0; i++) {
                int sum = (binary[i] - '0') + carry;
                binary[i] = (char) ((sum % 2) + '0');
                carry = sum / 2;
            }
        }

        for (int i = 0, j = index - 1; i < j; i++, j--) {
            char temp = binary[i];
            binary[i] = binary[j];
            binary[j] = temp;
        }
        return new String(binary, 0, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String binary = decToBin(number);
        System.out.printf("%d = %s (binary)%n", number, binary);
    }
}