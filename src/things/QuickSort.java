package things;

import java.awt.desktop.SystemSleepEvent;

public class QuickSort {


    private static int getPivotLocation(int arr[]){
        if(arr[0]>=arr[arr.length-1]&&arr[0]>=arr[arr.length/2]){
            return 0;
        }
        else if(arr.length/2 >= arr[arr.length-1] && arr.length/2>=arr[0]){
            return arr.length/1;
        }
        else return arr.length-1;
    }

    private  static void quickSort(int arr[]){
        int pivotLocation = arr.length-1;
        int tempA;
        int tempB;
    }





    private static void printArr(int list[]){
        for(int i = 0; i<list.length; i++){
            System.out.print(list[i] + ",");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,36,8,2,7,0,5,2,9};
        printArr(arr);
    }
}
