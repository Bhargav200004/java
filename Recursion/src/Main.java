import java.util.Scanner;

class Main{
    static String removing(String str,int idx){
        if(idx==str.length()) return "";              //making empty string for base case
        if (str.charAt(idx)!='v') return str.charAt(idx)+removing(str,idx+1);
        else return removing(str,idx+1);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println("Out put ");
        System.out.println(removing(s,0));

    }

}