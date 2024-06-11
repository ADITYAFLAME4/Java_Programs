package com.vectors;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(null);                 //Index:0
        v.add(1);            //Index:1
        v.add(1);            //Index:2
        v.add(null);            //Index:3
        v.add("Sheela");            //Index:4

        System.out.println(v);  // [null, 1, 1, null, Sheela]
        System.out.println(v.get(4)); //Sheeela
    }
}
