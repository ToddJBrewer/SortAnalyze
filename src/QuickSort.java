public class QuickSort {
    public static void sort(double[] arr, int bot, int top) {
        if (bot <= top) {
            int p = partition(arr, bot, top);
            sort(arr, bot, p - 1);
            sort(arr, p + 1, top);
        }
    }

    public static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

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