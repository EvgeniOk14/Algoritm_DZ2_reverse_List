import static java.util.Collections.list;

public class List
{
    Node head;
    Node tail;

    public void add(int value)
    {
        Node node = new Node(value);
        node.value = value;
        if (head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void print()
    {
        Node node = head;
        while (node != null)
        {
            System.out.println(node.value);
            node = node.next;
        }
    }
    public void addMiddle(int value, Node node)
    {

        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.previous = node;
        if(next == null)
        {
            tail = newNode;
        }
        else
        {
            next.previous = newNode;
            newNode.next = next;
        }
    }
}