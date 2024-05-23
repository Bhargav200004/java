import java.util.HashSet;

public class SetInterfaceImpl {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        System.out.println(hashSet);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(105);
        hashSet.add(4255);
        System.out.println(hashSet);
    }
}
