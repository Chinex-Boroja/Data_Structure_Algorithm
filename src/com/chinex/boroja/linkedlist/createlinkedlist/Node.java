package com.chinex.boroja.linkedlist.createlinkedlist;

public class Node {
    //reference to the next node in the chain, or null if there isn't one
    Node next;

    //Data carried by this node, could be of any type
    Object data;

    public Node(Object dataValue) {
        next = null;
        data = dataValue;
    }

    //another Node constructor if we want to specify the node to point to
    public Node(Object dataValue, Node nextValue) {
        next = nextValue;
        data = dataValue;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        this.next = nextValue;
    }
}
