package hw40.conveut;

public class DollarConverter implements Converter{

    @Override
    public int getConvertedValue(int value) {
        int amount = value * 12;
        return amount;
    }
}
