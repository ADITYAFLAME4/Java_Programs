package com.priorityq;
import java.util.PriorityQueue;

// boolean contains (Object o)
//returns true if this list contains the specified elements

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

    //    pq.add(null); // Null Pointer Exception
        pq.add(10);
        pq.add(10);
        pq.add(3);
        pq.add(1);
    //    pq.add('c'); //CCE (Class Caste Exception)
    System.out.println(pq);
    }
    
}
