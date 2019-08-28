package io.techinterview.codingproblems;

public class StackGeneric<T> {

    // TODO: Implement a Stack data structure which can any type of data
    //  What do we need?
    //  1. Object Array to hold data values
    //  2. Capacity of an array

    private Object[] items;
    private int capacity;
    private int top;

    public StackGeneric() {
        this.top = -1;
        this.capacity = 10; // default capacity
        this.items = new Object[capacity];
    }

    public StackGeneric(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        this.items = new Object[capacity];
    }

    public boolean push(T item) throws RuntimeException {
        if (isFull()) {
            throw new RuntimeException("Stack is full.");
        }
        items[++top] = item;
        return true;
    }

    public T pop() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return (T) items[top--];
    }

    public T peek() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return (T) items[top];
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }

}
