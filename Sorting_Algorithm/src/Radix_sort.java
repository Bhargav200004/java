public class Radix_sort {

    static int findMaxElement(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void CountSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];

        //frequencyArray or Count Array
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / place) % 10]++;
        }

        //creating prefix sum of count Array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        //finding the index of each element in the original array and put it into the output array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        //copying the output array to the original array
        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }

    static void RadixSort(int[] arr) {
        int max = findMaxElement(arr);

        //call counting sort for radix sort
        for (int place = 1; max / place > 0; place *= 10) {
            CountSort(arr, place);
        }
    }

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 6, 32234, 7, 425, 8, 53424, 7};

        RadixSort(arr);

        display(arr);

    }
}
