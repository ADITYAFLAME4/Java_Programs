package com.arraylist;
import java.util.ArrayList;
public class ArrayList2 {
        public static void main(String[] args) {
        
        //ArrayList-1
        ArrayList al = new ArrayList();
        al.add(null);   //0
        al.add(null);   //1
        al.add(1);      //2
        al.add(1);      //3
        al.add('a');    //4
        al.add("Sheela");   //5
        System.out.println(al);

        //ArrayList-2
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        System.out.println(al1);
        al.addAll(2,al1);
        System.out.println(al);
        System.out.println(al1);
    }
    
}
