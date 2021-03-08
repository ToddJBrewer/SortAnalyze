public class BubbleSort {

    /**
     * sorts array with bubble sort method
     * @param arr the array to be sorted
     * @return the sorted array
     */
    public static double[] sort(double[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length -1; j++)
                if (arr[j] > arr[j+1])
                    swap(arr, j, j+1);
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
}
