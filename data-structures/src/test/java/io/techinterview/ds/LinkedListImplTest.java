package io.techinterview.ds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListImplTest {

    private LinkedListImpl<Integer> list;

    @BeforeEach
    public void init() {
        list = new LinkedListImpl<Integer>();
    }

    @Test
    public void sizeShouldBeZero() {
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void sizeShouldNotBeZero() {
        list.add(1);
        list.add(2);
        list.add(3);

        Assertions.assertNotEquals(0, list.size());
    }

    @Test
    public void listShouldBeEmpty() {
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    public void listShouldNotBeEmpty() {
        list.add(1);
        list.add(2);
        list.add(3);

        Assertions.assertFalse(list.isEmpty());
    }

    @Test
    public void shouldRemoveValue() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(new Integer(2));

        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void shouldRemoveIndex() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);

        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void shouldRemoveAllItems() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeAll();

        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void shouldContainValue() {
        list.add(1);
        list.add(2);
        list.add(3);

        boolean result = list.contains(new Integer(2));

        Assertions.assertTrue(result);
    }

    @Test
    public void shouldNotContainValue() {
        list.add(1);
        list.add(2);
        list.add(3);

        boolean result = list.contains(new Integer(0));

        Assertions.assertFalse(result);
    }

    @Test
    public void shouldAddItem() {
        Integer item = new Integer(1);
        list.add(item);

        boolean result = list.contains(item);

        Assertions.assertTrue(result);
    }

    @Test
    public void shouldGetItem() {
        list.add(1);
        list.add(2);
        list.add(3);

        Integer item = list.get(2);

        Assertions.assertEquals(3, item);
    }

    @Test
    public void shouldThrowException() {
        list.add(1);
        list.add(2);
        list.add(3);

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(4));
    }
}
