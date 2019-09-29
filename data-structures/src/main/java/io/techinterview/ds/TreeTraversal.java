package io.techinterview.ds;

import java.util.*;
import java.util.LinkedList;

public class TreeTraversal {

    protected String preOrder(Node node) {
        if(node == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(node.data);
        sb.append(preOrder(node.left));
        sb.append(preOrder(node.right));
        return sb.toString();
    }

    protected String inOrder(Node node) {
        if(node == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(inOrder(node.left));
        sb.append(node.data);
        sb.append(inOrder(node.right));
        return sb.toString();
    }

    protected String postOrder(Node node) {
        if(node == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(postOrder(node.left));
        sb.append(postOrder(node.right));
        sb.append(node.data);
        return sb.toString();
    }

    protected  String levelOrder(Node node) {
        if(node == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()) {
            Node n = q.poll();
            sb.append(n.data);
            if(n.left != null) {
                q.add(n.left);
            }
            if(n.right != null) {
                q.add(n.right);
            }
        }
        return sb.toString();
    }


    protected static class Node<T> {
        T data;
        Node left;
        Node right;

        Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }
}
