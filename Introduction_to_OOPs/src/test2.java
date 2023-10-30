 public class test2 {
     public static void main(String[] args){
        students s1 = new students("Saini",48);

        s1.Attendence=true;

//            System.out.println(s1.Name);
//            System.out.println(s1.Roll_No);
//            System.out.println(s1.Attendence);
//
//            s1.check(30);
//
//            students s2 = new students("Bhargav",10);
//
//         System.out.println(s2.Name);
//         System.out.println(s2.Roll_No);

//         int x = 20;
//         int y = 10;
//         System.out.println(x+" "+y);
//         swap(20,10);
//         System.out.println(x+" "+y);

         pair p1 = new pair(10 , 20);
         System.out.println(p1.x+" " + p1.y);
         swap(p1);
         System.out.println(p1.x+" " + p1.y);

     }

     private static void swap(pair p1) {
         int temp = p1.x;
         p1.x = p1.y;
         p1.y = temp;
     }

     private static void swap(int x , int y) {
         int temp = x;
         x = y;
         y=temp;
     }

 }