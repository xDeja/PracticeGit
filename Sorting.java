import java.util.Arrays;
public class Sorting{
    public static void main(String[] args) {
        int[] currentArray = new int[]{3,21,4,3,42,41,1,123,13};
        int[] sortedArray = mergeSort(currentArray);

        print("Hello World from Git!");
        print("Current Array: " + Arrays.toString(currentArray));
        print("Sorted Array: " + Arrays.toString(sortedArray));
        
    }

    public static int[] mergeSort(int[] currentArray){
        if(currentArray.length <= 1) return currentArray;
        
        
        int middleIndex = currentArray.length/2;
        int[] leftArray = Arrays.copyOfRange(currentArray, 0, middleIndex);
        int[] rightArray = Arrays.copyOfRange(currentArray, middleIndex, currentArray.length);

        return mergeSortHelper(mergeSort(leftArray), mergeSort(rightArray));
    }

    public static int[] mergeSortHelper(int[] leftArray, int[] rightArray){
        int[] sortedArray = new int[leftArray.length + rightArray.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < leftArray.length && j < rightArray.length){
            if(leftArray[i] <= rightArray[j])
                sortedArray[k++] = leftArray[i++];
            else
                sortedArray[k++] = rightArray[j++];
        }

        while(i < leftArray.length){
            sortedArray[k++] = leftArray[i++];
        }

        while(j < rightArray.length){
            sortedArray[k++] = rightArray[j++];
        }

        return sortedArray;
    }

    public static void print(Object o){
        System.out.println(o);
    }
}
