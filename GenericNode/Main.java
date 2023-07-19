public class Main
{
    public static void main(String[] args)
    {
//        GenericLinkedListT<String> gll = new GenericLinkedListT<>();
//
//        gll.add("5");
//        gll.add("5");
//        gll.add("hello");
//        gll.add("3");
//        gll.add("5");
//        gll.add("10");
//        gll.add("1");
//        gll.print();

        GenericLinkedListT<Integer> gll = new GenericLinkedListT<>();
        gll.add(5);
        gll.add(5);
        gll.add(3);
        gll.add(5);
        gll.add(10);
        gll.add(1);
        gll.print();

//        gll.addSorted("4");
//        gll.print();
//
//        gll.remove("hello");
//        gll.print();
//
//        gll.addSorted("7");
//        gll.print();

        gll.quickSort();
        gll.print();

//        ull.remove(10);  // удаление по заданному значению
//        ull.print();
//
//        ull.addToIndex(3, 300); // добавление по индексу
//        ull.print();
//
//        ull.addFirst(800);  // Добавление в начало списка
//        ull.print();
//
//
//        ull.addNode();   //  Добавляет ноду
//        System.out.println("Добавили ноду: ");
//        ull.print();
//        System.out.println(" ");
//
//        ull.deleteNode();   //  Удаляет ноду
//        System.out.println("Удалили ноду: ");
//        ull.print();
//        System.out.println(" ");
//
//        ull.removeAt(4);  // удаление по заданному индексу
//        ull.print();
//
//        ull.removeAll(5); // Удаление всех вхождений по заданному значению
//        ull.print();
//
//        ull.swap(0, 2);  // Обмен значений по заданному индексу
//        ull.print();
//
//        System.out.println(ull.getValue(2));  //  Получения значения по заданному индексу
//
//        ull.setValue(1, 45); //  Установка заданного значения по заданному индексу
//        ull.print();
//
//        System.out.println("Копирование листа: ");
//        ull.copyList();   // Копирование листа
//        ull.print(); // Копирование листа

    }

}
