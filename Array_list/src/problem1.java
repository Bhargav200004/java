import java.util.ArrayList;

public class problem1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

       list.add(55);
       list.add(55);
       list.add(585);
       list.add(555);
       list.add(557);
       list.add(553);
       list.add(535);
       list.add(53);
       list.add(568);
       list.add(14);
       list.add(58);
       list.add(57);
       list.add(53);

        System.out.println("Original list");
        System.out.println(list);

        System.out.println("After the removing even number");
        Remove(list);
        System.out.println(list);

    }

    public static void Remove(ArrayList<Integer> list){

        for(int i = list.size()-1 ; i >=0 ; i--){
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }


    }
}
