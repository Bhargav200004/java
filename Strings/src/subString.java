import java.util.zip.ZipFile;

public class subString {

    static String removeDuplicateElement(String str){
        //base case :- If the string have only one character or empty then it returns the Default String
        if (str.length() <= 1) return str;

        //If if 0 and 1 index character are same then skip 0th index
        if (str.charAt(0) == str.charAt(1)){
            return removeDuplicateElement(str.substring(1));
        }
        //else it is not equal then add with further string
        else{
            return str.charAt(0) + removeDuplicateElement(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "aazbbby";

        System.out.println(removeDuplicateElement(str));

    }
}
