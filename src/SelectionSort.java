
public class SelectionSort {

    /**
     * sorts array with selection sort method
     * @param arr the array to be sorted
     * @return the sorted array
     */
    public static double[] sort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, findSmall(arr, i));
        }
        return arr;
    }

    /**
     * swap function
     * @param arr the array to be sorted
     * @param i first element in swap
     * @param j second element in swap
     */
    public static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     * finds smallest element
     * @param arr the array to be sorted
     * @param left starting index
     * @return the smallest element
     */
    public static int findSmall(double[] arr, int left) {
        int smallest = left;
        for (int i = left+1; i < arr.length; i++) {
            if (arr[i] < arr[smallest]) {
                smallest = i;
            }
        }
        return smallest;
    }
}
