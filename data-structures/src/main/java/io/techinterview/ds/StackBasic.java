package io.techinterview.ds;

public class StackBasic {

    // TODO: Implement a Stack data structure which can hold integers
    //  What do we need?
    //  1. Array to hold integer values
    //  2. Capacity of an array

    private int[] num;
    private int capacity;
    private int top;

    public StackBasic() {
        top = -1;
        this.capacity = 10; // default capacity
        this.num = new int[capacity];
    }

    public StackBasic(int capacity) {
        top = -1;
        this.capacity = capacity;
        this.num = new int[capacity];
    }

    public boolean push(int item) throws RuntimeException {
        if(isFull()) {
            throw new RuntimeException("Stack is full.");
        }
        num[++top] = item;
        return true;
    }

    public int pop() throws RuntimeException {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return num[top--];
    }

    public int peek() throws RuntimeException {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return num[top];
    }

    public int size() {
        return (top + 1);
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
