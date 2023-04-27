package hw16;

public class Shahma {
    public static void main(String... args){
        int x = 8;
        int y = 8;
        int [][] myArray = new int[x][y];
        boolean isOneV = true;
        for (int [] rArr : myArray) {
            for (int i = 0; i < rArr.length; i++) {
                if (isOneV) rArr[i] = 1;
                else rArr[i] = 0;
                System.out.printf("%2d", rArr[i]);
                isOneV = !isOneV;
            }
            System.out.println();
        }
    }
}
