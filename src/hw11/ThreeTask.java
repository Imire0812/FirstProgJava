package hw11;
import java.util.Scanner;
public class ThreeTask {

    //Задача3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуй. Ты собрался выкидывать мусор? Выбирай цвет контейнера. ");
        System.out.println("Синий, коричневый, желтый, черный. ");
        String col = sc.next();

        if (col.equalsIgnoreCase("blue") || col.equalsIgnoreCase("Blue") ||
                col.equalsIgnoreCase("синий") || col.equalsIgnoreCase("Синий") ||
        col.equalsIgnoreCase("голубой") || col.equalsIgnoreCase("Голубой")){
            System.out.println("В синий мы выкидываем бумагу, картон и бумажные изделия");
        } else if (col.equalsIgnoreCase("brown") || col.equalsIgnoreCase("Brown") ||
        col.equalsIgnoreCase("коричневый") || col.equalsIgnoreCase("Коричневый")) {
            System.out.println("В коричневый мы отправляем остатки еды и био отходы");
        } else if (col.equalsIgnoreCase("yellow") || col.equalsIgnoreCase("Yellow") ||
                col.equalsIgnoreCase("Желтый") || col.equalsIgnoreCase("Жёлтый") ||
                        col.equalsIgnoreCase("жёлтый") || col.equalsIgnoreCase("желтый")) {
            System.out.println("В желтый мы отправляем все что из пластика");
        } else if (col.equalsIgnoreCase("черный") || col.equalsIgnoreCase("Черный") ||
                col.equalsIgnoreCase("Black") || col.equalsIgnoreCase("black")) {
            System.out.println("В черный мы выбрасываем все остальное, кроме стекла");
            } else {
            System.out.println("Стекло в спецальный контейнер большой такой, так же и старые вещи. " +
                    "Контейнеры обычно рядом с супермакетом");
        }
        }
    }