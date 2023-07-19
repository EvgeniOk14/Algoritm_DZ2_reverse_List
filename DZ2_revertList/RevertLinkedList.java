import org.w3c.dom.Node;

public class RevertLinkedList
{
    private Node head;
    private Node tail;
    private int size;

    public RevertLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void reverse()
    {
        Node current = head;
        Node temp;

        while (current != null)
        {
            temp = current.next;
            current.next = current.prev;
            if (temp != null)
            {
                current.prev = temp;
                current = temp;
            }
            else
            {
                current.prev = null;
                current = null;
            }
        }

        temp = head;
        head = tail;
        tail = temp;
    }

    public void reverseDLL( ) {
        Node temp=head; //swap head and tail
        head=tail; // head now points to tail
        tail=temp; //tail points to head
        //traverse the list swapping prev and next fields of each node
        Node p=head; //create a node and point to head

        while(p!=null) //while p does not equal null
        { //swap prev and next of current node
            temp=p.next; // p.next does that not equal null? confusing.
            p.next=p.prev; //this line makes sense since you have to reverse the link
            p.prev=temp; //having trouble visualizing this.
            p=p.next;//advance current node which makes sense
        }
    }

    public void addLast(int value) // Добавление элементов в конец списка
    {
        if (head == null)
        {
            head = new Node(value);
            size = 1;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = new Node(value);
        size++;
    }

    public void print()   // печать значений списка и размер списка
    {
        System.out.print("[ ");
        Node currentNode  = head;
        while(currentNode != null)
        {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
            System.out.println("] size: " + size);
        }




    public class Node
    {
        int value;
        Node next;
        Node prev;

         Node()
        {

        }
        Node(int value)
        {
            this.value = value;
        }

    }
}
