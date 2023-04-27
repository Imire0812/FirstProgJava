package hw16;

public class TablMnogen {
    public static void main(String... args){
        for(int i = 1; i < 11; i++){
            for(int k = 1; k < 11; k++){
                System.out.print(k * i + " ");
            }
            System.out.println(" ");
        }
    }
}