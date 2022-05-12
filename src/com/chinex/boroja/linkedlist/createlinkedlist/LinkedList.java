package com.chinex.boroja.linkedlist.createlinkedlist;

public class LinkedList {

    private static int counter;
    private Node first;


    public LinkedList() {

    }
    //appends the specified element to the end of this list
    public void add(Object data) {
        //initialize Node only in case of 1st element
        if (first == null) {
            first = new Node(data);
        }

        Node linkedTemp = new Node(data);
        Node linkedCurrent = first;

        //let's check for NPE before iterating over the current linked list
        if (linkedCurrent != null) {

            while (linkedCurrent.getNext() != null) {
                linkedCurrent = linkedCurrent.getNext();
            }
            //The last node's "next" reference set our new node
            linkedCurrent.setNext(linkedTemp);
        }
            //Increment the number of elements variable
            incrementCounter();
    }
    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    //inserts the specified element at the specified position in this list
    public void add(Object data, int index) {
        Node linkedTemp = new Node(data);
        Node linkedCurrent = first;

        if (linkedCurrent != null) {
            for (int i = 0; i <index && linkedCurrent.getNext() != null; i++) {
                linkedCurrent = linkedCurrent.getNext();

                //set the new node's next node reference to this node's next node referec
            }
        }
    }
}
