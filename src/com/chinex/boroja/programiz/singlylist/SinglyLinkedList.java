package com.chinex.boroja.programiz.singlylist;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data; //Can be of any type(Generic type)
        private ListNode next; // Reference to next ListNode in the list

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Print elements or nodes of a singly linked List
     */
    public void printItems() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    /**
     * Find the Length of a singly linked list
     */
    public int findLength() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * Insert Node at the beginning of a Singly Linked list in Java
     */
    public ListNode insertNode() {
        ListNode newNode = new ListNode(8);
        newNode.next = head;
        return head = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(9);
        ListNode fourth = new ListNode(11);

        //Now we will connect them together to form a chain
        sll.head.next = second; // 10 --> 1
        second.next = third; // 10 --> 1 --> 9
        third.next = fourth; // 10 --> 1 --> 9 --> 11 --> null

        sll.printItems();
        System.out.println("The length of a singly linked list is: " + sll.findLength());

    }
}
