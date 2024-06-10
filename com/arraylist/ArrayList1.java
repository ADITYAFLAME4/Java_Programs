package com.arraylist;
import java.util.ArrayList;
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(null);   //0
        al.add(null);   //1
        al.add(1);      //2
        al.add(1);      //3
        al.add('a');    //4
        al.add("Sheela");  //5

        //al.add(3, 100);
        System.out.println(al);
    }
    
}
