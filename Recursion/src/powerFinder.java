import java.nio.file.attribute.FileAttribute;

public class powerFinder
{

    static int power(int n ){
        if (n == 1) return 2;

        return 2 * power(n-1);
    }

    static boolean printOF(int n){
        if (n == 1) return true;
        if (n % 2 == 0){
            return printOF(n / 2);
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(printOF(32));
    }
}
