package com.arraylist;
import java.util.ArrayList;

public class ArrayList4 {

    public static void main(String[] args) {
        
        ArrayList al = new ArrayList(); //10
        al.add(10); // 0
        al.add(20); // 1
        al.add(30); // 2
        al.add(40); // 3

        System.out.println(al); // [10,20,30,40]

        Object o = 20;
        al.remove(o); // Object type==> Removes the first occurrence of the specified element from this list.

        System.out.println(al); // [10,30,40]
    }
    
}
