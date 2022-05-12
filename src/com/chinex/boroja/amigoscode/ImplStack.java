package com.chinex.boroja.amigoscode;

import java.util.List;
import java.util.Stack;

public class ImplStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(8);
        stack.push(9);
        stack.push(16);
        stack.push(32);
        stack.push(65);
        stack.push(80);

        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack);
    }

}
