public class SingleLinkList<T>
{
    ListItem<T> head;
    ListItem<T> tail;

    private static class ListItem<T>
    {
        T data;
        ListItem<T> next;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void addLast(T item)
    {
        ListItem<T> newItem = new ListItem<>();
        newItem.data = item;
        if (isEmpty())
        {
            head = newItem;
            tail = newItem;
        }
        else
        {
            tail.next = newItem;
            tail = newItem;
        }
    }

    public void reverse()
    {
        if (!isEmpty() && head.next != null)
        {
            tail = head;
            ListItem<T> current = head.next;
            head.next = null;
            while (current != null)
            {
                ListItem<T> next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        }
    }
    public void print()   // печать значений списка и размер списка
    {
        System.out.print("[ ");
        ListItem<T> currentNode = head;
        while (currentNode != null)
        {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println("] ");
    }
}

