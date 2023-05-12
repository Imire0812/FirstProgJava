package hw40.Tolk;

public interface Dialog {

    String readName();

    String greeting();

    String askAboutDistrict();

    String askAboutLocation();

    String askAboutPosition();

    String askAboutPhone();

    void result();
}