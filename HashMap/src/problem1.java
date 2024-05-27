import java.util.HashMap;
import java.util.Map;

/*
    Given an array , find the most frequent element in it . if there are multiple element that
    appear a maximum number of times, print any one of them

    n = 6
    arr[] = {1,3,2,1,4,1}

    output
    1

 */
public class problem1 {

    static void mostFrequentArray(int [] arr){
        int n = arr.length;
        int maxValue = -1;
        int ansKey = -1;


        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i]) + 1 );
            }
            else {
               hashMap.put(arr[i] , 1);
            }
        }

        for (var e : hashMap.entrySet() ){
            if (maxValue < e.getValue() ){
                maxValue = e.getValue();
                ansKey = e.getKey();
            }
        }

        System.out.println("Maximum frequency is = " + ansKey);
    }
    public static void main(String[] args) {
        int [] arr = {1 ,3 ,2, 1, 4, 1,4,4,4,105};
        mostFrequentArray(arr);
    }
}
