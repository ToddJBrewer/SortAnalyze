import java.util.Random;

public class Test {
    public static void main(String[] args) {

        //creating 50k-500k sized arrays to test sort methods
        double[] arr50k = createArray(50000);
        double[] arr100k = createArray(100000);
        double[] arr150k = createArray(150000);
        double[] arr200k = createArray(200000);
        double[] arr250k = createArray(250000);
        double[] arr300k = createArray(300000);
        double[] arr350k = createArray(350000);
        double[] arr400k = createArray(400000);
        double[] arr450k = createArray(450000);
        double[] arr500k = createArray(500000);

        //array to store test arrays and a results array
        double[][] outerArr = {arr50k, arr100k, arr150k, arr200k, arr250k, arr300k, arr350k, arr400k, arr450k, arr500k};
        double[] results = new double[10];

        //small array I used to test accuracy of each sorting method
        double[] test = {5, 9, 3, 4, 0, 3, 5, 88, 0, 1, 3, 5, 9, 32, 4, 0, 33, 4, 6, 9, 2, 3, 585};
        QuickSort.sort(test, 0, test.length-1);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + "\n");
        }
        //loop to sort each array with each type of sorting method
        //time to sort is stored in results array
        //comment out which arrays are not being currently tested
        System.out.print("Selection Sort Test \n");
        for (int i = 0; i < outerArr.length; i++) {
            System.out.print("begin test " + i + " = " + System.currentTimeMillis() + "\n");
            long begin = System.currentTimeMillis();
            SelectionSort.sort(outerArr[i]);
            System.out.print("end test " + i + " = " + System.currentTimeMillis() + "\n");
            long end = System.currentTimeMillis();
            System.out.println(end - begin);
            results[i] = (end - begin);
        }

        System.out.print("Bubble Sort Test \n");
        for (int i = 0; i<outerArr.length; i++ ) {
            System.out.print("begin test "+i+" = " + System.currentTimeMillis() + "\n");
            long begin = System.currentTimeMillis();
            BubbleSort.sort(outerArr[i]);
            System.out.print("end test "+i+" = " + System.currentTimeMillis() + "\n");
            long end = System.currentTimeMillis();
            System.out.println(end - begin);
            results[i] = (end - begin);
        }

        System.out.print("Insertion Sort Test \n");
        for (int i = 0; i<outerArr.length; i++ ) {
            System.out.print("begin test "+i+" = " + System.currentTimeMillis() + "\n");
            long begin = System.currentTimeMillis();
            InsertionSort.sort(outerArr[i]);
            System.out.print("end test "+i+" = " + System.currentTimeMillis() + "\n");
            long end = System.currentTimeMillis();
            System.out.println(end - begin);
            results[i] = (end - begin);
        }

        System.out.print("Merge Sort Test \n");
        for (int i = 0; i<outerArr.length; i++ ) {
            System.out.print("begin test "+i+" = " + System.currentTimeMillis() + "\n");
            long begin = System.currentTimeMillis();
            MergeSort.sort(outerArr[i], outerArr[i].length);
            System.out.print("end test "+i+" = " + System.currentTimeMillis() + "\n");
            long end = System.currentTimeMillis();
            System.out.println(end - begin);
            results[i] = (end - begin);
        }

        System.out.print("Quick Sort Test \n");
        for (int i = 0; i<outerArr.length; i++ ) {
            System.out.print("begin test "+i+" = " + System.currentTimeMillis() + "\n");
            long begin = System.currentTimeMillis();
            QuickSort.sort(outerArr[i], 0, outerArr[i].length-1);
            System.out.print("end test "+i+" = " + System.currentTimeMillis() + "\n");
            long end = System.currentTimeMillis();
            System.out.println(end - begin);
            results[i] = (end - begin);
        }

        //loops through and prints out results of sort time testing
        for (int i = 0; i < results.length; i++) {
            System.out.print(i + " = " + results[i] + "\n");

        }
    }
    /**
     * creates array with random elements
     * @param size size of array
     * @return randomly generated array
     */
    public static double[] createArray(int size) {
        double[] arr = new double[size];
        for (int i= 0; i<arr.length; i++) {
            arr[i] = (new Random()).nextFloat();
        }
        return arr;
    }

}
