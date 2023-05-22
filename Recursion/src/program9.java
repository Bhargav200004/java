//Remove all the occurrence of 'a' from string s ="abcax"

import java.util.Scanner;

public class program9 {
    static String Remove(String str,int index){
        //base case
        if(index==str.length()) return "";
        //recurse work
        if(str.charAt(index)!='a') return str.charAt(index)+Remove(str,index+1);
        else return Remove(str,index+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println(Remove(s,0));

    }

}
