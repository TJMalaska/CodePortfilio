package things;

public class QuickSortWithAndrew {
    int coolguy[] = {1,5,3,8,5,8,3,6,94,6,};


    public static void QuickSort(int arr[]){
        int itemFromLeftTemp;
        int itemFromRightTemp;
        int pivot = arr.length-1;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > pivot){
                itemFromLeftTemp = i;
                break;
            }
        }
        for(int i = arr.length-1; i > 0; i--) {
            if (arr[i] < pivot) {
                itemFromRightTemp = i;
                break;
            }
        }


    }
}
