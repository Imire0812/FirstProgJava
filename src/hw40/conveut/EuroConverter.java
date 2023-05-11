package hw40.conveut;

public class EuroConverter implements Converter{
    @Override
    public int getConvertedValue(int value) {
        int amount = value * 10;
        return amount;
    }
}
