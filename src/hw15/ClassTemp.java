package hw15;

public class ClassTemp {
    public static void main(String[] args){
        int[] temper = new int[]{6, 4, 5, 7, -2, 2, 3};
        double srn = 0;
        if (temper.length > 0){
            double sum = 0;
            for (int j = 0; j < temper.length; j++){
                sum += temper[j];
            }
            srn = sum / temper.length;
            System.out.println(srn);
        }
    }
}