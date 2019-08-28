package io.techinterview.codingproblems;

import java.util.*;

public class LinkedList<T> {

    private Node head;
    private Node tail;

    private int size;

    public boolean add(T data) {
        if(head == null) {
            addFirst(data);
            tail = head;
            return true;
        } else {
            return addLast(data);
        }
    }

    public boolean add(T data, int index) {
        Node n = this.head;
        for(int i = 0; i < index - 1; i++) {
            n = n.next;
        }

        Node node = createNode(data);
        node.next = n.next;
        n.next = node;
        return true;
    }

    public boolean addFirst(T data) {
        Node node = createNode(data);
        node.next = head;
        head = node;
        size++;
        return true;
    }

    public boolean addLast(T data) {
        Node node = createNode(data);
        tail.next = node;
        tail = node;
        size++;
        return true;
    }

    public Optional<T> remove(T data) {
        if(!isEmpty()) {
            T item = (T) head.data;
            head = head.next;
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
            T item = (T) n.data;
            p.next = n.next;
            n.next = null;
            return Optional.of(item);
        }
        return Optional.empty();
    }

    public boolean removeAll() {
        while(head != null) {
            Node n = head;
            head = head.next;
            n.next = null;
        }
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    private Node createNode(T data) {
        return new Node(data);
    }

    class Node<T> {
        T data;
        Node next;

        Node() {}

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
