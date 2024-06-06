public class kMultiple {

    static void PrintKMultiple(int num , int k){
        if (k == 1) {
            System.out.println(num);
        }else{
            PrintKMultiple(num , k -1);
            System.out.println(num * k);
        }
    }

    public static void main(String[] args) {
        int num = 12 ;
        int k = 5 ;

        //output
        //12 -> 24 -> 36 -> 48 -> 60

        PrintKMultiple(num, k);
    }
}
