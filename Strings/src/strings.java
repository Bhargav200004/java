import java.util.*;          //all laibraries are added
public class strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //basic string  always initializing with capital S
        String s="hello world";
        System.out.println(s);

        //Talking input from the user as a String
//        String str =sc.nextLine();
//        System.out.println(str);

        //s.length is use for length finding of String
         System.out.println(s.length());

         //s.charAt() is use for finding the character at that index
        System.out.println(s.charAt(8));

        //s.indexOf() work for finding first character in String
        System.out.println(s.indexOf('l'));

        //s.compareTO(str) for comparing two strings


        //s.contains() for checking string  is present or not like bollean
        System.out.println(s.contains("ll"));

        //s.startsWith() for checking string is starts with letter are not
        System.out.println(s.startsWith("helo"));

        //s.concat() for adding two strings
        
    }
}
