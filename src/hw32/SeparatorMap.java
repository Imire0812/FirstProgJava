package hw32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SeparatorMap {
    private final static String SEPARATOR = ": ";
    private static Map<String, String> readDict() throws FileNotFoundException {
        final String filename = "res/dict.txt";
        Map<String, String> result = new HashMap<>();
        Scanner scanner = new Scanner(new File(filename));
        int n = scanner.nextInt();
        scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            String line = scanner.nextLine();
            int separatorIndex = line.indexOf(':');
            if (separatorIndex == -1){
                continue;
            }
            String word = line.substring(0, separatorIndex);
            int toSkip = ": ".indexOf(SEPARATOR);
            String definition = line.substring(separatorIndex + SEPARATOR.length());
        }
        scanner.close();
        return result;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Map<String, String> dict = readDict();
                System.out.println(dict);
    }
}