package hw49;

import java.text.ParseException;
import java.util.*;

public class Base {
    // Будет общая база (система учёта), в которой заказы будут храниться в Map<Integer, Order>
    // Заказы могут удаляться, а ID при этом меняться не будут. Нумерация будет "разреженной" 1, 2, 7
    private final Map<Integer, Order> orders = new HashMap<>();

    // Внутренняя система учёта заказов в цветочном магазине.
    // Функционал:
    // - добавить заказ
    // - изменить заказ
    // - удалить заказ

    // добавить заказ: работает с клавиатурой
    public void add() {
        Scanner scanner = new Scanner(System.in);
        boolean added = false; // флаг "заказ добавлен"
        System.out.print("Введите описание букета: ");
        String content = scanner.nextLine();
        do {
            try {
                System.out.print("Введите дату (в формате 'dd.MM.yyyy HH:mm'): ");
                String date = scanner.nextLine();
                add(content, date); // работает с прочитанными данными
                // если не случилось ошибки, то
                added = true;
            } catch (ParseException e) {
                System.out.println("Некорректный формат даты: " + e.getMessage());
            }
        } while (!added); // повторять, пока заказ не добавлен
    }

    // добавить заказ: работает с готовыми данными
    public void add(String content, String date) throws ParseException {
        Order order = new Order(content, date);
        int orderId = order.getId();
        // такого не должно быть, именно поэтому мы пишем что-то вроде теста
        if (orders.containsKey(orderId)) {
            // если произошло то, что никогда не должно происходить, выбрасываем ошибку
            throw new RuntimeException("Заказ с id " + orderId + " уже существует");
        }
        orders.put(orderId, order);
    }

    public void printOrders() {
        // перебор словаря (Map):
//    for (Map.Entry<Integer, Order> entry : orders.entrySet()) { // перебор пар ключ-значение
//    for (int orderId : orders.keySet()) { // перебор ключей
//    for (Order order : orders.values()) { // перебор значений
        // Map<Integer, Order> orders - словарь с ID и заказами
        // orders.values() - Collection<Order> - все значения словаря - набор заказов
        // new ArrayList(...) - создать список из указанной в скобках коллекции
        // итог: List<Order> orders - список заказов (чтобы можно было сортировать)
        List<Order> orders = new ArrayList<>(this.orders.values());
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}