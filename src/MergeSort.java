public class MergeSort {

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




/*   public static void merge(float[] left, float[] right, float[] arr) {
        int l = 0, r = 0, i = 0;
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                arr[i++] = left[l++];
            }
            else {
                arr[i++] = right[r++];
                r++;
            }
        }
        while (l<left.length) {
            arr[i++] = left[l++];
        }
        while(r<right.length) {
            arr[i++] = right[r++];
        }
    }

    public static float [] get_left(float[] arr) {
        int size = arr.length/2;
        float[] left = new float[size];
        for (int i = 0; i < size; i++) {
            left [i] = arr[i];
        }
        return left;
    }

    public static float [] get_right(float[] arr) {
        int size = arr.length/2;
        float[] right = new float[size];
        for (int i = 0; i < size; i++) {
            right [i] = arr[i+size];
        }
        return right;
    }

    public static float [] mergeSort(float[] arr) {
        if (arr.length>1) {
            float[] left = get_left(arr);
            float[] right = get_right(arr);
            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }
        return arr;

    }*/



}
