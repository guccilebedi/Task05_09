package com.company;

public class BinaryTree {
    private BinaryTreeNode root = null;

    public BinaryTree() { }

    private void putNode(int value, BinaryTreeNode node) {
        if (root == null) {
            root = new BinaryTreeNode(value);
        } else {
            if (value > node.getValue()) {
                if (node.getRight() != null) {
                    putNode(value, node.getRight());
                } else {
                    node.setRight(new BinaryTreeNode(value));
                }
            } else {
                if (value < node.getValue()) {
                    if (node.getLeft() != null) {
                        putNode(value, node.getLeft());
                    } else {
                        node.setLeft(new BinaryTreeNode(value));
                    }
                }
            }
        }
    }

    public void put(int value) {
        putNode(value, root);
    }

    public int min() {
        int min = root.getValue();
        BinaryTreeNode node = root;
        while (node.getLeft() != null) {
            min = node.getLeft().getValue();
            node = node.getLeft();
        }
        return min;
    }

    private void printNode(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue());
        if (node.getRight() != null || node.getLeft() != null) {
            System.out.print(" " + "(" + " ");
            printNode(node.getLeft());
            printNode(node.getRight());
            System.out.print(")" + " ");
        } else {
            if (node.getLeft() == null)
            System.out.print(" ");
        }
    }

    public void print() {
        printNode(root);
        System.out.println("\n");
    }

    public void clear() {
        root = null;
    }
}
