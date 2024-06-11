import java.util.*;

public class RelativeSortArray {

    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0 ; i < arr1.length ; i++){
          arrayList.add(arr1[i]);
        }

        Collections.sort(arrayList);

        for (var arr : arrayList) {
            if (hashMap.containsKey(arr)) hashMap.put(arr, hashMap.get(arr) + 1);
            else hashMap.put(arr, 1);
        }


        arrayList.removeAll(arrayList);

        for (int i = 0; i < arr2.length; i++) {
            if (hashMap.containsKey(arr2[i])) {
                while (hashMap.get(arr2[i]) != 0) {
                    hashMap.put(arr2[i], hashMap.get(arr2[i]) - 1);
                    arrayList.add(arr2[i]);
                }
                hashMap.remove(arr2[i]);
            } else {
                arrayList.add(hashMap.remove(arr2[i]));
            }
        }

        for (var key : hashMap.keySet()){
            if (hashMap.containsKey(key)) {
                while (hashMap.get(key) != 0) {
                    hashMap.put(key, hashMap.get(key) - 1);
                    arrayList.add(key);
                }
            } else {
                arrayList.add(hashMap.get(key));
            }
        }

        int[] ans = new int[arrayList.size()];
        for (int i = 0 ; i < ans.length ; i++){
            ans[i] = arrayList.get(i);
        }

        System.out.println(arrayList);

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

//        [2,42,38,0,43,21,5,7,12,12,13,23,24,24,27,29,30,31,33,48]
        // 2 42 38 0 43 21 5 7 12 13 23 24 27 29 30 31 33 48

        int[] ans = relativeSortArray(arr1, arr2);

        for ( int i : ans){
            System.out.print(i+" ");
        }
    }


}
