package hw38.homeWork;

public class MainBook {
    public static void main(String[] args) {
        Book priut = new Book("Э.М.Ремарк", "Приют грез");
        Book teni = new Book("Э.М.Ремарк", "Тени в раю");
        Book blek = new Book("Э.М.Ремарк", "Черный обелиск");

        System.out.println(priut.equals(teni));
        System.out.println(priut.equals(blek));
        System.out.println(blek.equals(priut));
        System.out.println(teni.equals(teni));
    }
}