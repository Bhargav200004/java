public class students {
    int Roll_No;
    String Name;
    Boolean Attendence;

    //default Constructor
    students(){}

    students(String s1, int y){
        Name =s1;
        Roll_No = y;
    }


    //copy Constructor
    students(students s1){
        Name= s1.Name;
        Roll_No =s1.Roll_No;
    }




    public void check(int speed) {
//        return "Speed of the student is" + speed;
                System.out.println("Speed of the student is " + speed);
    }

}


