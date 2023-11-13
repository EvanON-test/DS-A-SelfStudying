package com.evan.datastructures;


import javax.xml.soap.Node;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

/**?
 * Represents the most basic Single Linked List data structure and an extended list of methods.
 *
 * Also serves as the perfect template for which I cna adhere to when creating other data structures
 * @param <T> T is a placeholder for a datatype which can be specified when an instance of a linked list is created.
 *          In summary it is a generic type parameter which makes the class more flexible and safe by allowing it to be
 *          instantiated for any type of object.
 */
public class LinkedList <T> {
    private Node<T> head;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        // Constructor of the Node class. Initializes the node with the provided data.
        // The next reference is set to null, indicating the end of the list at this point.
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor of the LinkedList class. Initializes a new LinkedList instance.
    // When a new list is created, it starts empty with the head being null.
    public LinkedList() {
        this.head = null;
    }


    public void addFirst(T data) {
        //Create a new node with given data
        Node<T> newNode = new Node<>(data);
        //Set the nodes next reference to the current head
        newNode.next = head;
        //Move to the next node
        head = newNode;
    }

    public void addLast(T data) {
        // Implementation
    }

    public void addAt(int index, T data) {
        // Implementation
    }

    public T removeFirst() {
        // Implementation
    }

    public T removeLast() {
        // Implementation
    }

    public T removeAt(int index) {
        // Implementation
    }

    public T getFirst() {
        // Implementation
    }

    public T getLast() {
        // Implementation
    }

    public T get(int index) {
        // Implementation
    }

    public void set(int index, T data) {
        // Implementation
    }

    public int size() {
        // Implementation
    }

    public boolean isEmpty() {
        // Implementation
    }

    public int indexOf(T data) {
        // Implementation
    }

    public boolean contains(T data) {
        // Implementation
    }

    public Node<T> find(T data) {
        // Implementation
    }

    public void reverse() {
        // Implementation
    }

    public Object[] toArray() {
        // Implementation
    }

    public void clear() {
        // Implementation
    }

    public LinkedList<T> clone() {
        // Implementation
    }

    public void sort(Comparator<? super T> c) {
        // Implementation
    }

    public Iterator<T> iterator() {
        // Implementation
    }

    public ListIterator<T> listIterator() {
        // Implementation
    }

    public void printList() {
        // Implementation
    }

    public void merge(LinkedList<T> otherList) {
        // Implementation
    }

    public LinkedList<T>[] split(int index) {
        // Implementation
    }


}
