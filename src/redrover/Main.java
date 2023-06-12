package redrover;

public class Main {
    // Кофейные напитки. Создадим перечисление Coffee. Добавим метод
    // getStrength(), указывающий его крепость.
    //

    public enum Coffee{
        Экспрессо(5),
        Латте(4),
        Капучинно(3),
        Американо(2),
        Мокко(4);

        private int strength;
        Coffee(int strength){
            this.strength = strength;
        }

        public int getStrength(){
            return strength;
        }

    }
    public static void main(String[] args) {
        for (Coffee coffee: Coffee.values()) {
            System.out.println(coffee + " - крепость кофе: " + coffee.getStrength());
        }
    }
}
