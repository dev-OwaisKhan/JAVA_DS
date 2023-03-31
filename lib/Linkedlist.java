package lib;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T element) {
        if (head == null) {
            head = new Node<T>(element);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<T>(element);
        }
        size++;
    }

    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = new Node<T>(element, head);
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = new Node<T>(element, current.next);
        }
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T element;
        if (index == 0) {
            element = head.data;
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            element = current.next.data;
            current.next = current.next.next;
        }
        size--;
        return element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = element;
    }

    public int indexOf(T element) {
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            if (current.data.equals(element)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public boolean contains(T element) {
        return indexOf(element) >= 0;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this(data, null);
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}