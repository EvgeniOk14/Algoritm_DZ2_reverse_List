class LinkedList<T> {
    private LinkedListItem<T> head;

    public class LinkedListItem<T>
    {
        T value;
        LinkedListItem<T> next;
        LinkedListItem<T> prev;

        LinkedListItem(T data)
        {
            value = data;
            next = prev = null;
        }

    }


    public void reverse() {
        LinkedListItem<T> temp = null;
        LinkedListItem<T> current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    void add(T value) {
        LinkedListItem<T> new_node = new LinkedListItem<>(value);
        new_node.prev = null;
        new_node.next = head;
        if (head != null)
        {
            head.prev = new_node;
        }
        head = new_node;
    }


    public void print()   // печать значений списка и размер списка
    {
        System.out.print("[ ");
        LinkedListItem<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println("] ");
    }
}