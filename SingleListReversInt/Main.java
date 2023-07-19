
public class Main {
    public static void main(String[] args) {

        SingleLinkList<Integer> sl = new SingleLinkList<>();

        sl.addLast(5);
        sl.addLast(5);
        sl.addLast(8);
        sl.addLast(3);
        sl.addLast(5);
        sl.addLast(10);
        sl.addLast(1);
        System.out.println("Исходный список чисел: ");
        sl.print();

        sl.reverse();
        System.out.println("Развёреутый список чисел: ");
        sl.print();
        System.out.println("--------------------------------------");

        SingleLinkList<String> sls = new SingleLinkList<>();

        sls.addLast("5");
        sls.addLast("5");
        sls.addLast("hello");
        sls.addLast("3");
        sls.addLast("privet");
        sls.addLast("1");
        sls.addLast("1");
        System.out.println("Исходный список строк: ");
        sls.print();

        sls.reverse();
        System.out.println("Перевёрнутый список строк: ");
        System.out.println(" ");
        sls.print();

    }
}