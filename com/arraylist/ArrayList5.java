package com.arraylist;
import java.util.ArrayList;
public class ArrayList5 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList(); //10

        al.add(10); //0
        al.add(20); //1
        al.add(30); //2
        al.add(40); //3
        System.out.println(al); // [10,20,30,40]

        ArrayList al2 = new ArrayList();

        al2.add(20); //0
        al2.add(30); //1
        al2.add(50); //2
        System.out.println(al2); // [20,30,50]

        al.removeAll(al2);

        System.out.println(al);
        System.out.println(al2);
    
    }
    
}
