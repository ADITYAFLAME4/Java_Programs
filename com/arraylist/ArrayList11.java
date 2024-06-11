package com.arraylist;
import java.util.ArrayList;
public class ArrayList11 {

    public static void main(String[] args) {
        
        ArrayList al = new ArrayList(); //10
        al.add(10); //0
        al.add(20); //1
        al.add(30); //2
        al.add(40); //3

        // for(int i = 0; i < al.size(); i++)
        // {
        //     System.out.println(al.get(i));
        // }

        for(Object ele : al)
        {
            System.out.println(ele);
        }
        
    }
    
}
