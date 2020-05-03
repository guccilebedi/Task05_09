package com.company;

import java.util.Iterator;
import java.util.Stack;

public interface DefaultBinaryTree<T> extends Iterable<T> {

    interface TreeNode<T> {
        T getValue();
        default TreeNode<T> getLeft() {
            return null;
        }
        default TreeNode<T> getRight() {
            return null;
        }
    }

    TreeNode<T> getRoot();

    default Iterable<T> inOrderValues() {
        return () -> {
            Stack<TreeNode<T>> stack = new Stack<>();
            TreeNode<T> node = getRoot();
            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }

            return new Iterator<T>() {
                @Override
                public boolean hasNext() {
                    return !stack.isEmpty();
                }

                @Override
                public T next() {
                    TreeNode<T> node = stack.pop();
                    T result = node.getValue();
                    if (node.getRight() != null) {
                        node = node.getRight();
                        while (node != null) {
                            stack.push(node);
                            node = node.getLeft();
                        }
                    }
                    return result;
                }
            };
        };
    }

    @Override
    default Iterator<T> iterator() {
        return inOrderValues().iterator();
    }
}
