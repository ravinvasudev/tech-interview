package io.techinterview.ds;

import java.util.*;

public class LinkedListImpl<T> {

    private Node head;
    private Node tail;

    private int size;

    public boolean add(T object) {
        if(head == null) {
            addFirst(object);
            tail = head;
            return true;
        } else {
            return addLast(object);
        }
    }

    public boolean add(T object, int index) {
        Node n = this.head;
        for(int i = 0; i < index - 1; i++) {
            n = n.next;
        }

        Node node = createNode(object);
        node.next = n.next;
        n.next = node;
        return true;
    }

    public boolean addFirst(T object) {
        Node node = createNode(object);
        node.next = head;
        head = node;
        size++;
        return true;
    }

    public boolean addLast(T object) {
        Node node = createNode(object);
        tail.next = node;
        tail = node;
        size++;
        return true;
    }

    public Optional<T> remove(T object) {
        if(!isEmpty()) {
            T item = (T) head.object;
            head = head.next;
            size--;
            return Optional.of(item);
        }
        return Optional.empty();
    }

    public Optional<T> remove(int index) {
        if(!isEmpty() && index < size) {
            Node n = head;
            Node p = null;
            for (int i = 0; i < index; i++) {
                p = n;
                n = n.next;
            }
            T item = (T) n.object;
            p.next = n.next;
            n.next = null;
            size--;
            return Optional.of(item);
        }
        return Optional.empty();
    }

    public boolean removeAll() {
        while(head != null) {
            Node n = head;
            head = head.next;
            n.next = null;
            size--;
        }
        return true;
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if(isEmpty()) {
            return null;
        }
        if(index > size()) {
            throw new IndexOutOfBoundsException("");
        }
        Node node = head;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return getNodeValue(node);
    }

    public boolean contains(T object) {
        if(isEmpty()) {
            return false;
        }
        for(Node node = head; node.next != null; node = node.next) {
            if(node.object.equals(object)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    private Node createNode(T object) {
        return new Node(object);
    }

    private T getNodeValue(Node node) {
        if(node == null) {
            return null;
        }
        return (T) node.object;
    }

    class Node<T> {
        T object;
        Node next;

        Node() {}

        Node(T object) {
            this.object = object;
            this.next = null;
        }
    }
}
