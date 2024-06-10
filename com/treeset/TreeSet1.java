package com.treeset;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(1000);
        ts.add(10);
        ts.add(5);
//      ts.add(null); // NPE (Null Pointer Exception)
//      ts.add("Sheela"); // CCE (Class Cast Exception)
        ts.add(20);
//      ts.add(10); // Duplicate Not allowed!

        System.out.println(ts); // [5,10,20,1000] (Auto Sorted!)

    }
}
