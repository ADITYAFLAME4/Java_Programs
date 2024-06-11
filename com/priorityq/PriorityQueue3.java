package com.priorityq;

import java.util.PriorityQueue;

public class PriorityQueue3 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        //    pq.add(null); // Null Pointer Exception
    pq.add(10);
    pq.add(10);
    pq.add(3);
    pq.add(1);
//    pq.add('c'); //CCE (Class Caste Exception)
    System.out.println(pq); // [1, 3, 10, 10]
    System.out.println(pq.poll());// 1  [It will retrive/fetch the topmost element of the Queue, removes it, There by the size gets decreased.] 
    System.out.println(pq); // [3, 10, 10]
    }
}
