package com.chinex.boroja.freecodecamp;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

@SuppressWarnings("unchecked")
public class Array<T> implements Iterable<T> {

    private T[] arr; // Internal stack array
    private int length = 0; // Length user thinks array is
    private int capacity = 0; // Actual array size

    public Array() {
        this(16);
    }

    public Array(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal capacity " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity]; //initialize the array and cast it to a type T
    }
    public int size() {
        return length;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public T get(int index) {
        return arr[index];
    }
    public void set(int index, T element) {
        arr[index] = element;
    }
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            arr[i] = null;
        }
        length = 0;
    }

    public void add(T element) {
        // Time to resize
        if (length + 1 >= capacity) {
            if (capacity == 0) capacity = 1;
            else capacity *= 2; // double the size
            T[] new_arr = (T[]) new Object[capacity];
            for (int i = 0; i < length; i++) {
                // Copy the old array into new array
                new_arr[i] = arr[i]; // Set old array to new array
            }
            arr = new_arr; // arr has extra nulls padded
        }
        // Copy the new value into the array
        arr[length++] = element;
    }

    public T removeAt(int rm_index) {
        if (rm_index >= length && rm_index < 0) throw new IndexOutOfBoundsException();
        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[length-1];
        for (int i = 0, j = 0; i < length; i++, j++) {
            if (i == rm_index) j--;
            else new_arr[j] = arr[i];
        }
        arr = new_arr;
        capacity = --length;
        return data;
    }

    public boolean remove(Object obj) {
        for (int i = 0; i < length; i++) {
            if (arr[i].equals(obj)) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < length; i++) {
            if (arr[i].equals(obj))
                return i;
        }
        return -1;
    }

    public boolean contains(Object obj){
        return indexOf(obj) != 1;
    }
    @Override
    public Iterator<T> iterator() {
        return new java.util.Iterator<T> () {
            int index = 0;
            public boolean hasNext() {
                return index < length;
            }
            public T next() {
                return arr[index++];
            }
        };
    }
    @Override
     public String toString() {
        if (length == 0) return "[]";
        else {
            StringBuilder sb = new StringBuilder(length).append("[");
            for (int i = 0; i < length; i++) {
                sb.append(arr[i]).append(", ");
            }
            return sb.append(arr[length - 1]).append("]").toString();
        }
     }
    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }
    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
