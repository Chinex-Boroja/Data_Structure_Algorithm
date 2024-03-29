package com.chinex.boroja.programiz.queues;

public class QueueImpl {
    private int SIZE = 5;
    int[] items = new int[SIZE];
    int front;
    int rear;

    public QueueImpl() {
        front = -1;
        rear = -1;
    }
    boolean isFull() {
        return front == 0 && rear == SIZE - 1;
    }
    boolean isEmpty() {
        return front == -1;
    }
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
                front++;
            }
            System.out.println("Deleted -> " + element);
            return (element);
        }
    }
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++) {
                System.out.println(items[i] + " ");
                System.out.println("\nRear index-> " + rear);

            }
        }
    }

    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl();

        //deQueue is not possible on empty queue
        queue.deQueue();

        //enQueue 5 elements
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        //6th element can't be added to the Queue, because the queue is full
        queue.enQueue(6);

        queue.display();

        //deQueue removes element entered first i.e 1
        queue.deQueue();

        //Now we have just 4 elements
        queue.display();
    }
}
