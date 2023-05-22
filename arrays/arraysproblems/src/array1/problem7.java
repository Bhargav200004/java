package array1;

import java.util.Scanner;

class problem7{

    static int [] FrequencyyArray(int arr[]){                     //new frequncy arr method is created
        int freq[]= new int[100001];                       //declare the arr size of freq
        for (int i=0;i< arr.length;i++){                   //traversing ( i )through arr
            freq[arr[i]]++;                                //freq index number is add through i
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=Sc.nextInt();
        int []arr=new int [n];

        System.out.println("Enter "+n+"number of element in array");
        for (int i=0;i<n;i++){
            arr[i]=Sc.nextInt();
        }

        int [] freq=FrequencyyArray(arr);

        System.out.println("Enter query element");
        int q=Sc.nextInt();                             //here q is created for query taken

        while(q>0){
            System.out.println("Enter number to be searched");
            int x=Sc.nextInt();                         //here number is taken present or not
            if (freq[x]>0){                             //giving to frequency arr
                                                         //here state that if arr is  present
                System.out.println("yes present");
            }
            else{                                       //here arr is not present
                System.out.println("no");
            }
            q--;                                        //then they decreases
        }


    }
}