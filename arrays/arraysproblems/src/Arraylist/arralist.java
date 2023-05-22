package Arraylist;
import java.util.ArrayList;

public class arralist {
    public static void main(String[] args) {

        //array list is created
        ArrayList<Integer> i=new ArrayList<>();


        //new element is adding
        i.add(5);
        i.add(6);
        i.add(7);
        i.add(8);

        //getting element at index 1

        System.out.println(i.get(1)); //6

        //printing with loops

        for (int j=0;j<i.size();j++){
            System.out.print(i.get(j)+" ");  // 5 6 7 8
        }
        System.out.println();

        //printing array list directly

        System.out.println(i);  //[5,6,7,8]


        //adding element at some index i

        i.add(1,50);
        System.out.println(i);

        //modifying an element at index i

        i.set(1,100);
        System.out.println(i);

        //removing an element at index i

        i.remove(1);
        System.out.println(i);

        //removing an element e

        i.remove(Integer.valueOf(6));
        System.out.println(i);

        //checking if an element exist

        boolean ans=i.contains(8);
        System.out.println(ans);


        //if you don't specify class ,you can put anything inside a

        ArrayList a=new ArrayList();
        a.add("hello");
        a.add(5);
        a.add(true);
        System.out.println(a);


    }
}
