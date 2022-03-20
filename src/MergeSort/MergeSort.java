package MergeSort;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 6, 4,0, 1, 99, 45, -7, 6 };
        int[] results = mergeSort(arr);

        for (int i: results) {
            System.out.print(i + ",");
        }
    }

    static void printArray(int nums[]) {
        for (int i: nums) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    static int[] mergeSort(int nums[]){
        System.out.print("IN-->");
        printArray(nums);

       if (nums.length < 2) {
           return nums;
       } else {
           int leftEndIndex = nums.length/2;
           int rightArraySize = nums.length - leftEndIndex;

           int[] leftNums = new int[leftEndIndex];
           int[] rightNums = new int[rightArraySize];

           System.arraycopy(nums, 0, leftNums, 0, leftEndIndex);
           System.arraycopy(nums, leftEndIndex, rightNums, 0, rightArraySize);

           leftNums = mergeSort(leftNums);
           rightNums = mergeSort(rightNums);

           int leftPointer = 0;
           int rightPointer = 0;

           for (int i =0; i < nums.length; ++i) {
               if (leftPointer == leftNums.length ||
                       (rightPointer < rightNums.length && rightNums[rightPointer] < leftNums[leftPointer])
               ) {
                   //take from right
                   nums[i] = rightNums[rightPointer++];
               } else {
                   //take from left
                   nums[i] = leftNums[leftPointer++];
               }
           }
           System.out.print("OUT->");
           printArray(nums);
           return nums;
       }
    }
}
