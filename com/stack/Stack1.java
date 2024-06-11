package com.stack;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        
        Stack s = new Stack();
        //add works Fine ---

        // s.add(null);
        // s.add(null);
        // s.add(1);
        // s.add("Sheela");

        s.push(null);
        s.push(null);
        s.push(1);
        s.push("Sheela");


        System.out.println(s); // [null, null, 1, Sheela]

        System.out.println(s.peek()); // Sheela [peek looks at the object at this stack without rmoving it from the stack]

        System.out.println(s); // [null, null, 1, Sheela]

        System.out.println(s.pop()); // Sheela [pop removes the object at the top of this stack and returns the object as the value]

        System.out.println(s); // [null, null, 1]
    }
}
