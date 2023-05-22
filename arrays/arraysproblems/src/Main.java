
import java.util.*;
public class Main {

    public static void prints(Object ... x)
    {
        for(Object i : x)
        {
            System.out.print(i);
        }
    }
    static public void main(String[] args) {
        Main.prints("hello world ",12);
    }

}
