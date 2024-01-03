package com.evan.datastructures.linkedlist;

import java.util.Iterator;

public class CircularLinkedList <T>{
    private Node<T> head;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public CircularLinkedList() {
        // Initially, the list is empty, so head is set to null.
        this.head = null;
    }

    // Insertion methods
    public void addFirst(int data) {
    }

    public void addLast(int data) {
    }

    public void addAt(int data, int index) {
    }

    // Deletion methods
    public void removeFirst() {
    }

    public void removeLast() {
    }

    public void removeAt(int index) {
    }

    public void remove(int data) {
    }

    // Search methods
    public boolean contains(int data) {
        return false;
    }

    public int indexOf(int data) {
        return -1;
    }

    // Access methods
    public int getFirst() {
        return -1; // Placeholder return value
    }

    public int getLast() {
        return -1; // Placeholder return value
    }

    public int getAt(int index) {
        return -1; // Placeholder return value
    }

    // Utility methods
    public int size() {
        return 0; // Placeholder return value
    }

    public boolean isEmpty() {
        return false;
    }

    public void clear() {
    }

    public void display() {
    }

    // Advanced operations
    public void reverse() {
    }

    public void sort() {
    }

    public int[] toArray() {
        return null; // Placeholder return value
    }

    public CircularLinkedList clone() {
        return null; // Placeholder return value
    }

    // Iterator
    public Iterator<Integer> iterator() {
        return null; // Placeholder return value
    }

    // Special cases
    public CircularLinkedList[] splitIntoTwo() {
        return null; // Placeholder return value
    }

    public boolean isCircular() {
        return true; // Placeholder return value
    }


}

