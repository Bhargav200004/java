import java.util.ArrayList;
import java.util.Collections;

public class Bucket_sort {

    static void BucketSort(float [] arr){

        int n = arr.length;

        ArrayList<Float> [] bucket = new ArrayList[n];

        //creating empty bucket

        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Float>();
        }

        //adding element in the bucket
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;
            bucket[bucketIndex].add(arr[i]);
        }

        //sorting the buckets
        for (int i = 0 ; i < bucket.length ; i++){
            Collections.sort(bucket[i]);
        }

        //merging all the element
        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            ArrayList<Float> currBucket = bucket[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[index++] = currBucket.get(j);
            }
        }
    }


    public static void main(String[] args) {

        float [] arr = {0.5f,0.6f,0.4f,0.2f,0.8f,0.5f};

        BucketSort(arr);

        for (float i : arr){
            System.out.print(i + " ");
        }
    }
}
