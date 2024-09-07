import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Implementation {

    private static class student{
        int rollNo;
        String Name;
        int marks ;
        String dob;

        student(int rollNo , String Name , int marks , String dob){
            this.rollNo = rollNo;
            this.Name = Name;
            this.marks = marks;
            this.dob = dob;
        }
    }

    private static class studentComparator implements Comparator<student>{

        @Override
        public int compare(student o1, student o2) {
            if(o1.rollNo > o2.rollNo)  return 1;
            else if (o1.rollNo < o2.rollNo) return -1;
            else  return 0;
        }
    }


    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(245);
        priorityQueue.add(13);
        priorityQueue.add(347);
        priorityQueue.add(2);
        priorityQueue.add(90);

//        System.out.println(priorityQueue.remove());
//        System.out.println(priorityQueue);


        student s1 = new student(10 , "Bhargav" , 23 , "13-12-2004");
        student s2 = new student(5 , "saini" , 65 , "06-09-2004");
        student s3 = new student(8 , "Govind" , 67 , "19-09-2004");
        studentComparator studentComparator = new studentComparator();
        PriorityQueue<student> studentPriorityQueue = new PriorityQueue<>(studentComparator);
        studentPriorityQueue.add(s1);
        studentPriorityQueue.add(s2);
        studentPriorityQueue.add(s3);
        assert studentPriorityQueue.peek() != null;
        System.out.println(studentPriorityQueue.peek().Name);










    }
}
