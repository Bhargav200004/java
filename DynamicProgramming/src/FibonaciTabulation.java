import java.util.HashMap;

public class FibonaciTabulation {
    public static void main(String[] args) {
        int prev1 = 1;
        int prev2 = 1;
        int current = 0;

        for (int i = 2 ; i < 10 ; i++){
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        HashMap<Integer , Integer> hashMap = new HashMap<>();
        hashMap.put(1 , 5);
        hashMap.put(4 , 2);
        hashMap.put(2 ,8);
        hashMap.put(6 , 1);

        int [] arr = new int[7];
        for (Integer value : hashMap.keySet()){
            System.out.print(value+" ");
            System.out.println(hashMap.get(value));
            arr[value - 1] = hashMap.get(value);
        }

        for (int i : arr){
            System.out.print(i + " ");
        }
//        System.out.println(hashMap);

        System.out.println();

        System.out.println(current);
    }
}
