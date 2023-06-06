package hw55;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;


// Queue - FIFO (first-in-first-out - первый пришёл, первый ушёл)
// реализация: LinkedList, все Deque
// Буквально "очередь" - как в магазин или к врачу
// Использование: обработка событий и команд
//  команды:
//  - add(e) - offer(e) - добавляет e в конец
//  - remove() - poll() - возвращает (и удаляет) элемент в начале
//  - element() - peek() - подсматривает первый элемент
// - обращение по индексу - n/a
// - поиск - n/a
// - вставка: в начало - n/a, в середину - n/a, в конец - O(1)
// - удаление: из начала - O(1), из середины - n/a, с конца - n/a
//
// Deque - double ended queue - как очередь, но добавлять и убирать можно и с начала, и с конца
// реализация: LinkedList, ArrayDeque
//  команды:
//  - addFirst(e) - offerFirst(e) - добавляет e в начало
//  - addLast(e) - offerLast(e) - add(e) - offer(e) - добавляет e в конец
//  - removeFirst() - pollFirst() - remove() - poll() - возвращает (и удаляет) элемент в начале
//  - removeLast() - pollLast() - возвращает (и удаляет) элемент в конце
//  - getFirst() - peekFirst() - element() - peek() - подсматривает первый элемент
//  - getLast() - peekLast() - подсматривает последний элемент
// - обращение по индексу - n/a
// - поиск - n/a
// - вставка: в начало - O(1), в середину - n/a, в конец - O(1)
// - удаление: из начала - O(1), из середины - n/a, с конца - O(1)
//
// PriorityQueue - очередь с приоритетом - элементы при добавлении сортируются в порядке,
//   соответствующем Comparable или Comparator
// - add(e) - offer(e) - добавляет элемент в правильное место
// - remove() - poll() - возвращает (и удаляет) элемент в начале (самый маленький)
// - element() - peek() - подсматривает первый (самый маленький) элемент
// - remove(o) - удалить элемент `o` (при наличии)
// - contains(o) - проверить наличие элемента `o`
// отличия от TreeSet:
//   - могут повторяться элементы,
//   - посмотреть на самый первый можно быстрее,
//   - перебрать все нельзя
// - обращение по индексу - n/a
// - поиск - O(log n)
// - вставка: в правильное место - O(log n) - бинарный поиск места
// - удаление: из начала - O(1), указанного элемента - O(log n)
public class File2Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

}
