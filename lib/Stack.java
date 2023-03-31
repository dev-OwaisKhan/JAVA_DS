package lib;

import java.util.EmptyStackException;

public class stack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public stack() {
        top = null;
        size = 0;
    }

    public void setSize(int size)
    {
        this.size = size;
    }
    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);
        node.next = top;
        top = node;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
}
