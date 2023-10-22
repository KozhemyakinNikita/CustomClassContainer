package com.kozhemyakin.lab1;
/*@author s.n.kozhemyakin*/
public class CustomClassContainer<T> {

/**
 * This CustomClassCountainer is implemented using a singly linked list.
 * This container allows you to add, get, and remove elements.
 *
 * @param <T> The type of elements to be stored in the container.
 */
    private Node<T> head;
    private int size;

    /**
     * Inner class to represent a node in the singly linked list.
     */
    private static class Node<T> {
        T data;
        Node<T> next;

        /**
         * Constructs a new node with the given data.
         *
         * @param data The data to be stored in the node.
         */
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Constructs an empty container.
     */
    public CustomClassContainer() {
        head = null;
        size = 0;
    }

    /**
     * Adds an element to the end of the container.
     *
     * @param element The element to be added.
     */
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    /**
     * Retrieves the element at the specified index in the container.
     *
     * @param index The index of the element to retrieve.
     * @return The element at the specified index.
     * @throws IndexOutOfBoundsException If the index is out of bounds.
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * Removes the element at the specified index from the container.
     *
     * @param index The index of the element to remove.
     * @throws IndexOutOfBoundsException If the index is out of bounds.
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    /**
     * Print elements of list
     */

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            if (temp.next != null) {
                System.out.print("-> ");
            }
            temp = temp.next;

        }
    }

    /**
     * Returns the number of elements in the container.
     *
     * @return The size of the container.
     */
    public int size() {
        return size;
    }
}

