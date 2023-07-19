public class UsualLinkedList
{
        private Node root;
        private int size;

        private  Node tail;



    public void addToIndex(int index, int data)  // Добавление элемента по заданному индексу
    {
        Node newNode = new Node(data);

        if (root == null)
        {
            root = newNode;
            tail = newNode;
            size = 1;
            return;
        }

        if (index == 0)
        {
            newNode.next = root;
            root.prev = newNode;
            root = newNode;
            return;
        }

        Node current = root;
        int i = 0;

        while (i < index - 1 && current != null)
        {
            current = current.next;
            i++;
        }

        if (current == null)
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        else
        {
            newNode.next = current.next;
            newNode.prev = current;
            current.next = newNode;
            if (newNode.next != null)
            {
                newNode.next.prev = newNode;
            }
            else
            {
                tail = newNode;
            }
        }
    }

    public void addFirst(int value)   // Добавление элемента в начало списка
    {
        Node newNode = new Node(value);

        if (root == null)
        {
            root = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = root;
            root.prev = newNode;
            root = newNode;
        }
    }


        public void addLast(int value) // Добавление элементов в конец списка
        {
            if (root == null)
            {
                root = new Node(value);
                size = 1;
                return;
            }
            Node currentNode = root;
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = new Node(value);
            size++;
        }


        public void addNode()  // добавляет ноду
        {
            Node node = new Node();
            if (root == null)
            {
                root = node;
                size = 1;
                return;
            }

            Node currentNode = root;
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = node;
            size++;
        }


    public void deleteNode()  // Удаление ноды
    {
        Node node =  new Node();
        if (node == null || root == null)
        {
            return;
        }

        if (root == node)
        {
            root = root.next;
        }

        if (tail == node)
        {
            tail = tail.prev;
        }

        if (node.prev != null)
        {
            node.prev.next = node.next;
            size--;
        }

        if (node.next != null)
        {
            node.next.prev = node.prev;
            size--;
        }
    }


        public boolean remove(int value) // Удаление одного элемента по заданному значению
        {
            if (root == null)
                return false;
            if (root.value == value)
            {
                root = root.next;
                size--;
                return true;
            }
            Node currentNode = root;
            while (currentNode.next != null)
            {
                if (currentNode.next.value == value)
                {
                    currentNode.next = currentNode.next.next;
                    size--;
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }


        public void removeAt(int index)  // удаление всех вхождений элемнта по заданному индексу
        {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException();
            if (index == 0) {
                root = root.next;
                size--;
                return;
            }
            Node preDeleted = this.getNode(index - 1);
            preDeleted.next = preDeleted.next.next;
            size--;
        }



        public int removeAll(int value)  // удаление всех вхождений элемента по заданному значению
        {
            int prevSize = size;
            while (root != null && root.value == value)
            {
                root = root.next;
                size--;
            }
            if (root == null)
                return prevSize - size;
            Node currentNode = root;
            while (currentNode.next != null)
            {
                if (currentNode.next.value == value)
                {
                    currentNode.next = currentNode.next.next;
                    size--;
                } else
                    currentNode = currentNode.next;
            }
            return prevSize - size;
        }



        private Node getNode(int index)   // получение ноды (класса Node) по заданному индексу
        {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException();
            Node currentNode = root;
            for (int i = 0; i < index; i++)
                currentNode = currentNode.next;
            return currentNode;
        }


        public int getValue(int index)  // получение значения по заданному индексу
        {
            return this.getNode(index).value;
        }

        public void setValue(int index, int value)
        {
            this.getNode(index).value = value;
        }



        public void swap(int index1, int index2) // обмен элементов в списке по заданным индексам
        {
            if (index1 < 0 || index1 >= size || index2 < 0 || index2 >= size)
                throw new IndexOutOfBoundsException();
            if (index1 == index2)
                return;
            Node node1 = null, node2 = null, currentNode = root;
            for (int i = 0; currentNode != null; i++)
            {
                if (index1 == i)
                    node1 = currentNode;
                else if (index2 == i)
                    node2 = currentNode;
                if (node2 != null && node1 != null)
                    break;
                currentNode = currentNode.next;
            }
            int temp = node1.value;
            node1.value = node2.value;
            node2.value = temp;
        }

        public void clear() // очищение всего списка
        {
            root = null;
            size = 0;
        }



        public UsualLinkedList copyList()    // копирование всего списка
        {
            UsualLinkedList copyList = new UsualLinkedList();
            Node currentNode = root;
            while (currentNode != null)
            {
                copyList.addLast(currentNode.value);
                currentNode = currentNode.next;
            }
            return copyList;
        }

        public void print()   // печать значений списка и размер списка
        {
            System.out.print("[ ");
            Node currentNode = root;
            while (currentNode != null)
            {
                System.out.print(currentNode.value + " ");
                currentNode = currentNode.next;
            }
            System.out.println("] size: " + size);
        }



        public int size()  // возврат длины списка
        {
            return size;
        }

        private class Node  // класс Node
        {
            int value;
            Node next;

            Node prev;

            Node()
            {
            }

            Node(int value)  // задание значения
            {
                this.value = value;
            }
        }
    }

