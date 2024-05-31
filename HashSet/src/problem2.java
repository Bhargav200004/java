import java.util.HashSet;

public class problem2 {

    static int distinctPair(int [] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        int size = 0 ;

        for (int i = 0 ; i < arr.length ; i++){
            if (hashSet.contains(arr[i])){
                size = Math.max(size , hashSet.size());
                hashSet.remove(arr[i]);
            }
            else{
                hashSet.add(arr[i]);
            }
        }

        return size;

    }

    public static void main(String[] args) {
        int [] arr = { 2 , 1 , 1 , 3, 2, 3};

        System.out.println(distinctPair(arr));
    }
}
