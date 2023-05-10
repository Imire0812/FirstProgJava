package hw39.alcohol;

import hw39.alcohol.AlcoholDrink;
import hw39.alcohol.Drink;
import hw39.alcohol.SoftDrink;

import java.util.ArrayList;
import java.util.List;

public class MainDrink {
    public static void main(String[] args){
        Drink drink = new AlcoholDrink("Kaka", 2.3);
        System.out.println(drink);

        Drink soda = new SoftDrink("Cola", true);
        System.out.println(soda);

        List<Drink> drinks = new ArrayList<>();
        drinks.add(soda);
    }
}

