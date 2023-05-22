
//Write a program to reverse each word in String
/*input =I am an Student
  output = I ma na tnedutS
 */
public class problem3 {
    public static void main(String[] args) {
        String str ="I am an Student";
        String ans ="";
        StringBuilder sc=new StringBuilder("");
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch!=' '){
                sc.append(ch);
            }
            else {
                sc.reverse();
                ans+=sc;
                ans+=" ";
                sc=new StringBuilder("");
            }
        }
        sc.append("");
        sc.reverse();
        ans+=sc;
        System.out.println(ans);
    }
}
