package Arraylist;
//Write a program to sort an ArrayList of Strings in descending order.

import java.util.ArrayList;
import java.util.Collections;

public class problem2 {
    public static void main(String[] args) {

        ArrayList<String> S=new ArrayList<>();
        S.add("Welcome ");
        S.add("to ");
        S.add("my ");
        S.add("Blender ");
        S.add("Project ");
        System.out.println("Original list"+S);
        Collections.sort(S);
        System.out.println("After Sorting "+S);

        Collections.sort(S,Collections.reverseOrder());
        System.out.println("Descending order"+S);
    }
}


