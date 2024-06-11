package com.hashst;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(null);
        hs.add(null);
        hs.add(20);
        hs.add(20);
        hs.add('c');
        hs.add("Sheela");

        System.out.println(hs); // [null, Sheela, c, 20, 10]
    }
    
}
