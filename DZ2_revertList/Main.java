public class Main
{
    public static void main(String[] args)
    {
        RevertLinkedList rl = new RevertLinkedList();

        rl.addLast(5);
        rl.addLast(5);
        rl.addLast(8);
        rl.addLast(3);
        rl.addLast(5);
        rl.addLast(10);
        rl.addLast(1);
        System.out.println("Original list:");
        rl.print();

        rl.reverseDLL();
        System.out.println("Revert list:");
        rl.print();


    }
}
