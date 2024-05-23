import java.util.ArrayList;

public class ListInterfaceImpl {

    static void ArrayListImpl(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(25);
        arrayList.add(50);
        arrayList.add(75);
        arrayList.add(100);
        System.out.println(arrayList);
        arrayList.set(1,(50*2));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList);
        System.out.println(arrayList.contains(100));
    }
    public static void main(String[] args) {
        ArrayListImpl();
    }
}
