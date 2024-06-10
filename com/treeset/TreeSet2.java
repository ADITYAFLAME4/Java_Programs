package com.treeset;
import java.util.TreeSet;
public class TreeSet2 {
    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet(); //Object
        ts.add(1000);
        ts.add(10);
        ts.add(5);
        //ts.add(null); // Null Pointer Exception (NPE)
        //ts.add("Sheela"); // Class Cast Exception (CCE)
        ts.add(20);
        //ts.add(10); // DUplicate Not Allowed!
        
        // For Each Loop
        for(Object ele:ts)
        {
            System.out.println(ele);
        }
    }
    
}
