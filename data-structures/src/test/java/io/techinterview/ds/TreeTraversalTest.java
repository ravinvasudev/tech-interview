package io.techinterview.ds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.techinterview.ds.TreeTraversal.Node;

public class TreeTraversalTest {

    private TreeTraversal tree;
    private Node node;
//            1
//        2       3
//      4   5   6   7

    @BeforeEach
    public void init() {
        node = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));
        tree = new TreeTraversal();
    }

    @Test
    public void preOrderTest() {
        String actual = tree.preOrder(node);
        Assertions.assertEquals("1245367", actual);
    }

    @Test
    public void inOrderTest() {
        String actual = tree.inOrder(node);
        Assertions.assertEquals("4251637", actual);
    }

    @Test
    public void postOrderTest() {
        String actual = tree.postOrder(node);
        Assertions.assertEquals("4526731", actual);
    }

    @Test
    public void levelOrderTest() {
        String actual = tree.levelOrder(node);
        Assertions.assertEquals("1234567", actual);
    }

    @Test
    public void levelOrderTest1() {
        node = new Node(1, null, new Node(3, new Node(6), new Node(7)));
        String actual = tree.levelOrder(node);
        Assertions.assertEquals("1367", actual);
    }
}
