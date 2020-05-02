package com.company;

public class Main {

    public static void test1() {
        BinaryTree binaryTree = new BinaryTree();
        for (int i = 0; i < 10; i++) {
            binaryTree.put((int) (Math.random() * 10 + 10));
        }
        binaryTree.print();
        int min = binaryTree.min();
        System.out.println("Tree minimum: " + min);
        System.out.println();
    }

    public static void test2() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.put(20);
        binaryTree.put(15);
        binaryTree.put(25);
        binaryTree.put(11);
        binaryTree.put(19);
        binaryTree.put(21);
        binaryTree.put(29);
        binaryTree.print();
        int min = binaryTree.min();
        System.out.println("Tree minimum: " + min);
        System.out.println();
    }

    public static void main(String[] args) {
        test1();
        test2();
    }
}
