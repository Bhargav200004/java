import java.util.HashSet;

public class HashSetImpl {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Bhargav");
        hashSet.add("Sai Durga");
        hashSet.add("Bhargav");

        System.out.println(hashSet);
        System.out.println(hashSet.contains("Bhargav"));
        System.out.println(hashSet.size());

        hashSet.remove("Sai Durga");

        System.out.println(hashSet);

        hashSet.add("Gujjla");

        for (var str : hashSet){
            System.out.println(str);
        }
    }
}
