import java.util.Scanner;

public class Selection_sort {

    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println("Enter Size Value of Array");
//        int n = sc.nextInt();

        int [] arr = {3,6,3,7,4,7,-1,7,-11,7,2};

        //Talking Input
//        System.out.print("Enter Element");
//        for (int i = 0 ; i <  n ; i++){
//            arr[i]= sc.nextInt();
//        }

        System.out.println("Sorted Array");
        SelectionSort(arr);

    }


    public static void SelectionSort(int []arr){

        for (int i = 0 ; i < arr.length - 1; i++){
            int minValue = arr[i];
            int minIndex = i;

            for (int j = i+1 ; j < arr.length ; j++){
                //checking the smallest number between
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j ;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

        for (int a : arr){
            System.out.print(a+",");
        }

    }

}
