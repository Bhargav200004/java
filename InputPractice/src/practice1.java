import java.util.*;

public class practice1 {

    // If size of an array Given
    public static void arraySizeIsGiven(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }


        for(int val : arr){
            System.out.print(val + " ");
        }
    }

    // Dynamic array input
    public static void dynamicSizeOfArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0 ; i < n ; i++){
            arrayList.add(sc.nextInt());
        }


        for(int val : arrayList){
            System.out.print(val + " ");
        }
    }

    public static void spaceSeparatedValue(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String [] arr = str.split(" ");
        int [] intArray = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i++) {
            intArray[i] = Integer.parseInt(arr[i]);
        }

        for (int val : intArray){
            System.out.print(val + " ");
        }
    }

    public static void separatedByComma(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.startsWith("{") && str.endsWith("}")){
            str = str.substring(1 , str.length() - 1);
        }

        String [] arr = str.split(",");
        for(String val : arr){
            System.out.print(val + " ");
        }

    }

    public static void main(String [] args){
//        arraySizeIsGiven();
//        dynamicSizeOfArray();

        separatedByComma();

    }


}
