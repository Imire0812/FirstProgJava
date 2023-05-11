package hw40.conveut;

public class Main {
    public static void main(String[] args) {

        int yuanAmount = 100;

        DollarConverter dollarConverter = new DollarConverter();
        int  yuanDollerAmount = dollarConverter.getConvertedValue(yuanAmount);

        EuroConverter euroConverter = new EuroConverter();
        int yuanEuroConverter = euroConverter.getConvertedValue(yuanAmount);

        System.out.println(yuanAmount + " in Euro: " + yuanEuroConverter);
        System.out.println(yuanAmount + " in Doller: " + yuanDollerAmount);

    }
}
