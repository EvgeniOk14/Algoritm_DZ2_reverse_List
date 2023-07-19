
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {

        UsualLinkedList ull = new UsualLinkedList();

        ull.addLast(5);
        ull.addLast(5);
        ull.addLast(8);
        ull.addLast(3);
        ull.addLast(5);
        ull.addLast(10);
        ull.addLast(1);
        ull.print();

        ull.remove(10);  // удаление по заданному значению
        ull.print();

        ull.addToIndex(3, 300); // добавление по индексу
        ull.print();

        ull.addFirst(800);  // Добавление в начало списка
        ull.print();


        ull.addNode();   //  Добавляет ноду
        System.out.println("Добавили ноду: ");
        ull.print();
        System.out.println(" ");

        ull.deleteNode();   //  Удаляет ноду
        System.out.println("Удалили ноду: ");
        ull.print();
        System.out.println(" ");

        ull.removeAt(4);  // удаление по заданному индексу
        ull.print();

        ull.removeAll(5); // Удаление всех вхождений по заданному значению
        ull.print();

        ull.swap(0, 2);  // Обмен значений по заданному индексу
        ull.print();

        System.out.println(ull.getValue(2));  //  Получения значения по заданному индексу

        ull.setValue(1, 45); //  Установка заданного значения по заданному индексу
        ull.print();

        System.out.println("Копирование листа: ");
        ull.copyList();   // Копирование листа
        ull.print(); // Копирование листа

    }
}
