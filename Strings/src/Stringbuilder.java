public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("My name is bhargav");
        System.out.println(str);

        //Changing the charcter at the index
        str.setCharAt(11,'B');
        System.out.println(str);

        //adding the string at the end in the existing string
        str.append(" Sai Durga");
        System.out.println(str);

        //inserting the new string in the index
        str.insert(11,"G ");
        System.out.println(str);


        //reversing the string
        str.reverse();
        System.out.println(str);






    }
}
