//Given a string ,the task is to toggle all the characters of the Sting
//i.e to convert Upper case to lower case and vise versa

import java.util.*;
public class Problem1 {

    static void Toggle(StringBuilder str){
        for (int i=0;i<str.length();i++){

            boolean flag=true;          //true --> capital

            char ch=str.charAt(i);          //here we're talking one character at a time

            if(ch==' ') continue;            // if there is space between them then it is ignored

            if(ch>=48&&ch<=57) continue;        //for number not talking

            int asci=(int)ch;                 //character --> integer as asci value

            if(asci>=97) flag =false;           //for small

            if (flag==true){                   //checking that is capital or not
                asci+=32;

                char dh=(char)asci;
                str.setCharAt(i,dh);
            }

            else{
                asci-= 32;
                char dh= (char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you String");
        StringBuilder str =new StringBuilder(sc.nextLine());
        System.out.println("Your entered string");
        System.out.println(str);

        System.out.println("YOur out put");
        Toggle(str);

    }
}
