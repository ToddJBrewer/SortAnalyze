public class QuickSort {

    /**
     * sorts array with quick sort method
     * @param arr the array to be sorted
     * @param bot variable which tracks bottom point of array
     * @param top variable which tracks top point of array
     * @return the sorted array
     */
    public static void sort(double[] arr, int bot, int top) {
        if (bot <= top) {
            int p = partition(arr, bot, top);
            sort(arr, bot, p - 1);
            sort(arr, p + 1, top);
        }
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
     * partition function
     * @param arr array to be partitioned
     * @param left variable tracking left side of array
     * @param top variable tracking right side of array
     * @return either top or left variable after swaps
     */
    public static int partition(double[] arr, int left, int right) {
        if (left < right) {
            int pivot = left;
            int bot = left + 1;
            int top = right;
            while (bot < top) {
                while (bot <= right && arr[bot] <= arr[pivot]) {
                    ++bot;
                }
                while (top >= bot && arr[top] > arr[pivot]) {
                    --top;
                }
                if (bot <= right && bot < top) {
                    swap(arr, bot, top);
                }
            }
            swap (arr, pivot, top);
            return top;
        }
        return left;

    }
}