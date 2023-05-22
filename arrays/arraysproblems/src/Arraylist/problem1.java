package Arraylist;

import java.util.ArrayList;
//Write a program to Reverse the given ArrayList

// here java has collection name class that have inbuilt feature of reverse
import java.util.Collection;
import java.util.Collections;


public class problem1 {
    //method for swapping the ArrayList
    static void reverse(ArrayList<Integer> n){
        int i=0,j=n.size()-1;                   //here size is the arraylist size

        while(i<j){
           Integer temp =Integer.valueOf(n.get(i));
           n.set(i,n.get(j));
           n.set(j,temp);
            i++;
            j--;
        }


    }

    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<>();
        n.add(0);
        n.add(10);
        n.add(3);
        n.add(5);
        n.add(22);
        n.add(10);

        System.out.println("Original Array"+n);
        //collection class have in built method
        Collections.reverse(n);
        //reverse(n);
        System.out.println("Reverse Array"+n);

        //for ascending order
        Collections.sort(n);
        System.out.println("Ascending order "+n);

        //for descending order
        Collections.sort(n,Collections.reverseOrder());
        System.out.println("Descending order "+n);


    }
}
