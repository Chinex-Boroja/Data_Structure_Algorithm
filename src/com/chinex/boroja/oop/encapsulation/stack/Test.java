package com.chinex.boroja.oop.encapsulation.stack;

public class Test {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
        System.out.println();
        System.out.print(stack.getSize());
    }

}
