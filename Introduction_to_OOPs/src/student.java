 class person {
//    int age =12;

     int rollno;
     String studentName;
//    public static void main(String[] args) {
//        //create the object in class
//        person Rohan= new person();     //person is the class and Rohan is the object of the class
//        //object created
//
//         //to call the object in code dot(.) operator is use
//        System.out.println(Rohan.age);
//
//    }

 }
 public class student {
//     int rollno;
//     String studentName;

     public static void main(String[] args) {
         person obj1=new person();

         obj1.rollno=2003;
         obj1.studentName="hello";


         System.out.println(obj1.rollno);
         System.out.println(obj1.studentName);

         person obj2=new person();
         obj2.rollno=2004;
         obj2.studentName="hi";
         System.out.println(obj2.rollno);
         System.out.println(obj2.studentName);



     }
}

