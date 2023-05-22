//Given a string s,return the number of palindromic substring in it.
// input s= "abc"  output =3


//problem

import java.util.*;

public class problem2 {
    static void palindromic(StringBuilder s){

         StringBuilder a=new  StringBuilder(s);

          a.reverse();

         if(s.equals(a)) {
             System.out.println(s+" string is palindrome");
         }


         else{
             System.out.println(s + " string is not palindrome");
        }
    }

    static boolean palindromic2(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j))  return false;


            i++;
            j--;

        }
//        if (lang==true) System.out.println("It is not palindrome number");
//
//        else {
//            System.out.println("It is a palindrome number");
//        }
        return true;

    }


    public static void main(String[] args) {
        int count =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();

        System.out.println("Previous string");
        System.out.println(str);
        System.out.println("After checking the sting");
        for (int i=0;i<str.length();i++){
            for (int j=1;j<=str.length();j++){
               if (palindromic2(str.substring(i,j))){
                   count ++;
               }
        }



    }
        System.out.println(count+"is parindriome");

    }
}
