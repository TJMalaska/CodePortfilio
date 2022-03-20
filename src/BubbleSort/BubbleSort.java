package BubbleSort;

public class BubbleSort {

    private  static  void bubbleSort(int arr[]){

        for (int n = 0; n < arr.length - 1; n++) {

            for (int i = 0; i < arr.length - 1; i++) {
                int posA = i;
                int posB = i+1;
                if (arr[posA] > arr[posB]) {
                    int tempA = arr[posA];
                    int tempB = arr[posB];
                    arr[posA] = tempB;
                    arr[posB] = tempA;
                    printArr(arr);
                    System.out.println();
                }
            }
        }
    }
    private  static  void printArr(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+",");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 6, 4,0, 1, 99, 45, -7, 6 };
        bubbleSort(arr);


    }
}
