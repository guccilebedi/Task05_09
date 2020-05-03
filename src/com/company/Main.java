package com.company;

public class Main {

    public static void test() throws Exception {
        BinaryTree<Integer> binaryTree = new BinaryTree<>(s -> Integer.parseInt(s));
        binaryTree.fromBracketNotation("20(15(11,19),25(21,29))");
        int min = binaryTree.min();
        System.out.println(min);
    }

    public static void main(String[] args) throws Exception {
        test();
    }
}
