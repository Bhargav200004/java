//Return all indices as Array List if X exist in the array

import java.util.ArrayList;

public class problem8 {
    //making the array list method
    static ArrayList<Integer> allIndices(int arr [],int target,int idx){
        //base case
        if(idx>=arr.length) return new ArrayList<Integer>();       //returning empty array list
        ArrayList<Integer> ans=new ArrayList<Integer>();
        //self work
        if(arr[idx]==target) ans.add(idx);

        //recursive work
        ArrayList<Integer> smallans= allIndices(arr,target,idx+1);
        ans.addAll(smallans);
        return ans;
    }

    static boolean isSorted(int arr[],int index){
        //base work
        if(index == arr.length-1) return true;

        //self work
        if(arr[index]>arr[index+1]) {
            return isSorted(arr,index+1);
        }

        else{
            return false;
        }
    }


    public static void main(String[] args) {
        int arr[]={1,5,3,4,5,6,5,8,5,10};
        int arr1 []={1,2,3,4,5,6,7,8,9};
        int target =5;
        ArrayList<Integer> ans=allIndices(arr,target,0);
        //for (each) loop is creating for printing an array
        for(Integer i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(isSorted(arr1,0));

    }
}
