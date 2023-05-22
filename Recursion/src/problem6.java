/*
print the max value of the arr []
 */
public class problem6 {
    static void print(int arr[],int index){
        if(index== arr.length) return;
        System.out.print(arr[index]+" ");
        print(arr,index+1);
    }

    static int maxArray(int arr[],int index){
        if(index==arr.length-1) return arr[index];
        return Math.max(arr[index],maxArray(arr,index+1));
    }

    static int sumarray(int arr[],int index){
        if (index==arr.length-1) return arr[index];
        return Math.addExact(arr[index],sumarray(arr,index+1));
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,45,657,6,756,74,5,75,67,465,7,4567};
        System.out.println("printing arr");
        print(arr,0);
        System.out.println();

        System.out.println("Max value");
        System.out.println(maxArray(arr,0));

        System.out.println("Sum of array");
        System.out.println(sumarray(arr,0));


    }
}
