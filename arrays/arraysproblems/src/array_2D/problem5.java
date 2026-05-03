package array_2D;

import org.jetbrains.annotations.NotNull;

import java.util.*;

//pascal triangle
public class problem5 {

    //printing of 2d arrays
    static void PrintArray(int arr[][]){

        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

static int[][] pascal(int n){
        int ans[][]=new int[n][];
        for (int i=0;i< n;i++){
            //ith row has i+1 column
            /*
             */
            ans[i]=new int [i+1];
            // 1st and last element of every row is 1
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];

            }
        }


        return ans;
}

    public static List<List<Integer>> fourSum(int[] arr, int target) {

        int n = arr.length;
        // edge case
        if(n < 4) return new ArrayList<>();

        // sort the arr
        Arrays.sort(arr);

        HashSet<List<Integer>> value = new HashSet<>();
        for(int i = 0 ; i < n-3 ; i++){
            for(int j = i+1 ; j < n-2;j++){
                int k = j+1;
                int l = n-1;
                while(k < l){
                    int sum = arr[i] + arr[j] + arr[k] +arr[l];
                    if(sum < target){
                        k++;
                    }
                    else if(sum > target){
                        l--;
                    }
                    else{
                        value.add(new ArrayList<>(List.of(arr[i] , arr[j] , arr[k] , arr[l])));
                        k++;
                        l--;
                    }
                }
            }
        }

        return new ArrayList<>(value);
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        //talking input for row
//        System.out.println("Enter n number");
//        int n=sc.nextInt();
//        int [][]ans =pascal(n);
//        PrintArray(ans);

//        int [][] arr = {{10 , 12},{5 , 34} , {2 , 64} , {22 , 1}};
//        Arrays.sort(arr, Comparator.comparingInt(i -> i[0]));
//
//
//
//        System.out.println(Arrays.deepToString(arr));

        int [] n = {4, 3, 6, 2, 1, 1} ;

        System.out.println(Arrays.toString(findTwoElement(n)));


    }

}


