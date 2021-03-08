public class InsertionSort {

    /**
     * sorts array with insertion sort method
     * @param arr the array to be sorted
     * @return the sorted array
     */
    public static double[] sort(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            double temp = arr[i];
            int j = i-1;
            while (j >=0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
}
