package com.company;

public class Main {

    public static void test() throws Exception {
        BinaryTree<Integer> binaryTree = new BinaryTree<>(s -> Integer.parseInt(s));
        binaryTree.fromBracketNotation("20(15(19,11),16(29,28))");
        int min = binaryTree.minLeft();
        System.out.println(min);
    }

    public static void main(String[] args) throws Exception {
        test();
    }
}
