import java.util.HashMap;

public class MapInterfaceExample {
    public static void main(String[] args) {
        HashMap<Integer , String> hashMap = new HashMap<>();
        hashMap.put(3,"Bhargav");
        hashMap.put(1,"meghana");
        hashMap.put(2,"anshu");
        hashMap.put(4,"raghav");
        hashMap.put(1,"vivek"); // override by new value
        hashMap.putIfAbsent(1,"sourik");

        System.out.println(hashMap);

        //iterating over map
//        for (var i : hashMap.values()){
//            if ("Bhargav" == i) System.out.print(i+" ");
//        }


//        System.out.println(hashMap.keySet());
//        System.out.println(hashMap.get(3));
//        System.out.println(hashMap.containsKey(5));
//        System.out.println(hashMap.containsValue("Bhargav"));
//        System.out.println(hashMap.values());
    }
}
