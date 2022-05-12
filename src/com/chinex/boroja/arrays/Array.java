package com.chinex.boroja.arrays;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        // if the array is full, resize it
        //Add the new at the end
        if (items.length == count) {
            //create a new array (twice the size)
            int[] newItems = new int[count * 2];
            //Copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        //Validate the index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        //Shift the items to the left to fill the hole
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        //if we find it, return index
        // Otherwise, return -1
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
            return i;
        }
        return -1;
    }
}
