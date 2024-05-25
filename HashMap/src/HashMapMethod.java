import java.util.HashMap;
import java.util.Map;

public class HashMapMethod {

    static void HashMapMethods() {
        //syntax
        // Map --> Interface    and    // HashMap --> class
        Map<String, Integer> map = new HashMap<>();

        //Adding element
        map.put("Akash", 19);
        map.put("yash", 34);
        map.put("Lav", 16);
        map.put("kamana", 24);
        map.put("nita", 53);

        //Getting value of key from hashmap
        System.out.println(map.get("Lav")); // 16
        System.out.println(map.get("meghana")); //null

        //changing / updating the value of hash map
        map.put("Akash", 29);  //Akash -> 29
        System.out.println(map.get("Akash"));

        //Removing the pair of hashMap
        System.out.println(map.remove("Akash"));
        map.remove("riya");

        //checking the key is present or not
        System.out.println(map.containsKey("Akash"));
        System.out.println(map.containsKey("nita"));

        //adding key if key doesn't exist already
        map.putIfAbsent("yashika", 30);
        map.putIfAbsent("yash", 30);

        //getting all the keys present in the map
        System.out.println(map.keySet());

        //getting all values form the map
        System.out.println(map.values());

        //getting all entry from the map
        System.out.println(map.entrySet());


        //Traversing all entries of hashmap -- multiple methods

        for (String key : map.keySet()) {
            System.out.printf("Age of %s is %d \n", key, map.get(key));
        }

        for (Map.Entry<String , Integer> e : map.entrySet()){
            System.out.printf("Age of %s is %d \n", e.getKey(), e.getValue());
        }


    }

    public static void main(String[] args) {
        HashMapMethods();
    }
}
