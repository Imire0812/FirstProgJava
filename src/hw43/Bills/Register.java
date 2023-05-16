package hw43.Bills;

public interface Register {

    // - добавлять позицию в чек
    void addLine(String position, double price);

    // - закрывать чек (и автоматически открывать новый)
    void closeBill();

    // - закрывать день и выводить общий отчёт
    void close();
}