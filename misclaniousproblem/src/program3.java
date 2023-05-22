

public class program3 {

    //Reversing the arrays
    static int [] reverseArray(int [] arr){
        int l=arr.length;                       //arr length
        int [] ans=new int[l];                  //making arr as ans variable
        int  j=0;                               //initilaizing the j as zero


        //Reversing array from the origin
        for (int i=l-1;i>=0;i--){               //here i initilasing as the last element of the given arr then give condition as the i
                                                //is greater or equal to zero then we subtract the condition and go to reverse

            ans[j++]=arr[i];                    //here we give the j as arr i and increment(pre) the value for arr

        }
        return ans;
    }


    static void swapArray(int[]arr ,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;

    }

    //reversing the arr in place
     static void swap(int arr[]){
//        for (int i=0,j=arr.length;i<j;i++,j--){
//            swapArray(arr,i,j);
//
//        }
         int i=0,j=arr.length;
         while(i<j){
             swapArray(arr,i,j);
             i++;
             j--;
         }

     }

    static void printarray(int arr []){          //function for the printing the arr
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans[]= new int[3];
        System.out.println(arr.length+"<-->"+ans.length); // 5 <--> 3
        System.out.print("orginal arr  =");
        printarray(arr);
        System.out.print("after reversing the arr  =" );
        swap(ans);
    }
}

