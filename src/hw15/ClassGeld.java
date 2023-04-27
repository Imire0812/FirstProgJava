package hw15;

import java.util.Arrays;

public class ClassGeld {
    public static void main(String[] args){

        int [] mas1 = new int[30];
        int [] mas2 = new int[30];

        for (int i = 0; i < 30; i++) {
            mas1[i] = (int)(Math.random()*30);
            mas2[i] = (int)(Math.random()*30);
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 10; i++) {
            average1 += mas1[i];
            average2 += mas2[i];
        }
        average1/=10;
        average2/=10;

        if(average1 > average1){
            System.out.println("Среднее арифметическое первого массива ("+average1+") больше среднего арифметического "+
                    "второго массива ("+average2+")");
        } else if(average1 < average2){
            System.out.println("Среднее арифметическое первого массива ("+average1+") меньше среднего арифметического "+
                    "второго массива ("+average2+")");
        } else {
            System.out.println("Средние арифметические массивов равны ("+average1+")");
        }
    }
}
