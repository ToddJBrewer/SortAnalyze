public class MergeSort {
    /**
     * function to merge array after splitting array into sub arrays
     * @param left left half of the array
     * @param right half of the array
     * @param arr array to be sorted
     * @param lSize variable to track sub array size
     * @param rSize variable to track sub array size
     */
    public static void merge(double[] left, double[] right, double arr[], int lSize, int rSize) {
        int i = 0, l = 0, r = 0;
        while(l < lSize && r < rSize) {
            if (left[l] < right[r]) {
                arr[i++] = left[l++];
            }
            else{
                arr[i++] = right[r++];
            }
        }
        while(l<lSize) {
            arr[i++] = left[l++];
        }
        while(r<rSize) {
            arr[i++] = right[r++];
        }
    }
    /**
     * sorts array with merge sort method
     * @param arr the array to be sorted
     * @param variable that tracks array length
     * @return the sorted array
     */
    public static double[] sort(double[] arr, int length) {
        if (length > 1) {
            int middle = length/2;
            double[] left = new double[middle];
            double[] right = new double[length-middle];

            int j = 0;
            for (int i = 0; i<length; i++) {
                if (i < middle) {
                    left[i] = arr[i];
                }
                else {
                    right[j] = arr[i];
                    j++;
                }
            }
            sort(left, middle);
            sort(right, length-middle);
            merge(left, right, arr, middle, length-middle);

        }
        return arr;
    }
}
