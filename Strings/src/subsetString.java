public class subsetString {
    public static void main(String[] args) {

        //substring for string
//        String str= "abcd";
//        System.out.println(str.substring(1));


//        String str="abcd";
//        for (int i=0;i<4;i++){
//            for (int j=i+1;j<=4;j++){
//                System.out.print(str.substring(i,j)+" ");
//            }
//        }

        String s="hello";
        s= s.substring(0,2)+"y"+s.substring(3);
        System.out.println(s);


        /*performance of string
        poor performance(immutability)

       
         */
    }
}
