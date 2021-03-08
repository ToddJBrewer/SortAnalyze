public class SelectionSort {

    public static double[] sort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, findSmall(arr, i));
        }
        return arr;
    }


    public static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int findSmall(double[] arr, int left) {
        int smallest = left;
        for (int i = left+1; i < arr.length; i++) {
            if (arr[i] < arr[smallest]) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {

    }
}
