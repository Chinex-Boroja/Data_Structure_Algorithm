package leetcode_streak.linked_list;

public class SinglyLinkedList {

    /**
     * Java program to demonstrate how to create a singly Linkedlist and Insert elements
     */
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        //Checking if the list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void displayList() {
        Node current = head;

        if (head == null) {
            System.out.println("The given list is empty");
        }

        System.out.println("The data in the given list are: ");
        while (current != null) {
            // printing each data in the list and next pointer pointing to the next node
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList newList = new SinglyLinkedList();

        newList.insert(10);
        newList.insert(30);
        newList.insert(50);
        newList.insert(5);
        newList.insert(100);
        newList.insert(70);

        newList.displayList();
    }
}
