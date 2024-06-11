package com.linkedlst;
import java.util.LinkedList;
public class LinkedList2 {

    public static void main(String[] args) {
        LinkedList  li = new LinkedList();

        li.add(10); //Index:0
        li.add(20); //Index: 1
        li.add(2); //Index: 2
        li.add('c'); //Index: 3
        li.add("Sheela"); //Index: 4

        System.out.println(li); // [10, 20, 2, c, Sheela]

        System.out.println(li.get(4)); // Sheela

        System.out.println(li.peek()); // 10

        System.out.println(li); // [10, 20, 2, c, Sheela]

        System.out.println(li.poll()); // 10

        System.out.println(li); // [20, 2, c, Sheela]
    }
    
}
