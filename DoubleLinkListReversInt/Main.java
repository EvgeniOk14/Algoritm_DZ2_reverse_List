public class Main
{
public static void main(String[] args)
        {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(2);
        list.add(4);
        list.add(8);
        list.add(10);

        System.out.println("Original list int: ");
        list.print();

        list.reverse();
        System.out.println(" ");
        System.out.println("Reversed list int: ");
        list.print();
        System.out.println("--------------------------------------");


                LinkedList<String> list1 = new LinkedList<>();

                list1.add("2");
                list1.add("Hello");
                list1.add("Hi");
                list1.add("125");
                list1.add("Privet");

                System.out.println("Original list1 String: ");
                list1.print();

                list1.reverse();
                System.out.println(" ");
                System.out.println("Reversed List1 String: ");
                list1.print();
        }
        }
