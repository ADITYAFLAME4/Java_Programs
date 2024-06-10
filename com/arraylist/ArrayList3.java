package com.arraylist;
import java.util.ArrayList;

//remove(int,index)
public class ArrayList3 {
 public static void main(String[] args) {
        
        //ArrayList
        ArrayList al = new ArrayList(); //10 (Default Size)
        al.add(10);     // 0
        al.add(20);     // 1
        al.add(30);     // 2
        al.add(40);     // 3

        System.out.println(al); // [10,20,30,40]

        al.remove(2);

        System.out.println(al); // [10,20,40]
       
    }
    
}
