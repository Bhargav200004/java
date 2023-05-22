/*
Given an array of n integers and a target value 
*/
public class problem7 {

    static void findAllIndices(int [] arr,int target,int idx){
        //base case
        if(idx >=arr.length){
            return;
        }
        if(arr[idx] ==target){
            System.out.print(idx+" ");
        }
        findAllIndices(arr,target,idx+1);

    }
    static void print(int arr[],int index){
        if(index==arr.length) return;
        System.out.print(arr[index]+" ");
        print(arr,index+1);
    }
    static boolean search(int arr[],int target ,int index){
        if(index >= arr.length ) return false;
        if(arr[index]==target) return true;
        return search(arr,target,index+1);
    }

    //Returning the index of an array other wise return -1
    static int search1(int arr[],int target ,int index){
        if(index >= arr.length ) return -1;
        if(arr[index]==target) return index;
        return search1(arr,target,index+1);
    }

    public static void main(String[] args) {
        int arr[]={4,2,3,4,5,4,4};
        int target=4;
        System.out.println("printing an array");
        print(arr,0);
        System.out.println();
        System.out.println("searching algo ");
        if(search(arr,target,0)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        System.out.println(search1(arr,target,0));
        System.out.println("finding index");
        findAllIndices(arr,target,0);


    }
}
