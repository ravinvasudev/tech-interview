package io.techinterview.ds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackGenericTest {

    private StackGeneric<Integer> stack;

    @BeforeEach
    public void setUp() {
        stack = new StackGeneric<Integer>(3);
    }

    @Test
    public void pushShouldSucceed() {
        boolean actual = stack.push(1);

        Assertions.assertTrue(actual);
    }

    @Test
    public void pushShouldYieldSize1() {
        stack.push(1);

        Assertions.assertEquals(1, stack.size());
    }

    @Test
    public void pushShouldNotThrowRuntimeException() {
        Assertions.assertDoesNotThrow(() -> stack.push(1));
    }

    @Test
    public void pushShouldThrowRuntimeException() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertThrows(RuntimeException.class, () -> stack.push(4));
    }

    @Test
    public void popShouldSucceed() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertEquals(3, stack.pop());
    }

    @Test
    public void popShouldRemoveItem() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int size = stack.size();
        stack.pop();

        Assertions.assertNotEquals(size, stack.size());
    }

    @Test
    public void popShouldThrowRuntimeException() {
        Assertions.assertThrows(RuntimeException.class, () -> stack.pop());
    }

    @Test
    public void popShouldNotThrowRuntimeException() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertDoesNotThrow(() -> stack.pop());
        Assertions.assertDoesNotThrow(() -> stack.pop());
        Assertions.assertDoesNotThrow(() -> stack.pop());
    }

    @Test
    public void peekShouldSucceed() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertEquals(3, stack.peek());
    }

    @Test
    public void peekShouldThrowRuntimeException() {
        Assertions.assertThrows(RuntimeException.class, () -> stack.peek());
    }

    @Test
    public void peekShouldNotThrowRuntimeException() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertDoesNotThrow(() -> stack.peek());
        Assertions.assertDoesNotThrow(() -> stack.peek());
        Assertions.assertDoesNotThrow(() -> stack.peek());
    }

    @Test
    public void peekShouldNotRemoveItem() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int size = stack.size();
        stack.peek();

        Assertions.assertEquals(size, stack.size());
    }

    @Test
    public void stackIsEmpty() {
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    public void stackIsFull() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertTrue(stack.isFull());
    }

    @Test
    public void sizeShouldBeZero() {
        Assertions.assertEquals(0, stack.size());
    }

    @Test
    public void size() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertEquals(3, stack.size());
    }

}
